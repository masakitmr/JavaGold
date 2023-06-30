package chapter8;

import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;

public class Main22 {

		public static void main(String[] args) throws Exception{
			System.out.println("commonPool : "+ForkJoinPool.commonPool()
			.getParallelism());
			IntStream.range(0, 100).parallel().forEach(i->
			System.out.println(Thread.currentThread().getName()+": "+i));
		}

}
