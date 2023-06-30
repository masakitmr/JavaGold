package chapter8;

public class Main2 {

	public static void main(String[] args) {
		Thread a=new Thread(new ThreadA2());
//		Thread b=new Thread(new ThreadB2());
		Thread b=new Thread(() ->{
			for(int i=0;i<5;i++) {
				System.out.println("B:"+i+" ");
			}
		});

		a.start();
		b.start();
//		a.start();
	}
}
class ThreadA2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("A:"+i+" ");
		}
	}
}
class ThreadB2 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("B:"+i+" ");
		}
	}
}
