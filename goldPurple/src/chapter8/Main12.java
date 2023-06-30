package chapter8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main12 {

	public static void main(String[] args) {
		ExecutorService service=null;
		try {
			service=Executors.newSingleThreadExecutor();
			System.out.println("service.execute()");
			for(int i=0;i<3;i++) {
				service.execute(() ->{
					System.out.println("thread task");
					for(int a=0;a<5;a++) {
						try {
							Thread.sleep(500);
							System.out.println(" * ");
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println();
				});
			}
		}finally {
			System.out.println("終わった？"+service.isShutdown());
//			service.shutdown();
			service.shutdownNow();
			System.out.println("ex.shutdown()");
			for(int i=0;i<100000;i++);
			System.out.println("終わった？"+service.isShutdown());
		}
	}

}
