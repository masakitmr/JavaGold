package chapter8;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Main14 {

	public static void main(String[] args) {
		ExecutorService service=null;
		try {
			service=Executors.newSingleThreadExecutor();
			Future<Date> result=service.submit(() -> new Date());
			System.out.println(result.get());
		}catch(InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}finally {
			if(service != null) {
				service.shutdown();
			}
		}
	}

}
