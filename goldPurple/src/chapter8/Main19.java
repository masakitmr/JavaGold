package chapter8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

class IntegerTest{

	private Integer syncInteger;
	private final AtomicInteger atomicInteger;

	public IntegerTest(){
		syncInteger=0;
		atomicInteger=new AtomicInteger(0);
	}
	synchronized public void addSyncInteger() {
		syncInteger++;
	}
	public void addAtomicInteger() {
		atomicInteger.getAndIncrement();
	}
	public void showDate() {
		System.out.println("syncInt : "+syncInteger);
		System.out.println("atmicInt : "+atomicInteger.get());
	}
}
public class Main19 {

	public static void main(String[] args) throws InterruptedException{
		IntegerTest obj=new IntegerTest();
		exec(() ->obj.addSyncInteger());
		exec(() ->obj.addAtomicInteger());
		obj.showDate();
	}
	private static void exec(Runnable task) throws InterruptedException{
		ExecutorService service=null;
		try {
			service=Executors.newFixedThreadPool(100);
			for(int i=0;i<10000;i++) {
				service.submit(task);
			}
			service.awaitTermination(10, TimeUnit.SECONDS);
		}finally {
			if(service !=null) {
				service.shutdown();
			}
		}
	}
}
