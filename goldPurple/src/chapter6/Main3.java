package chapter6;

import java.util.stream.Stream;

public class Main3 {

	public static void main(String[] args) {
		long result1=Stream.of("a","b","c").count();
		System.out.println(result1);
		Stream<String> stream1=Stream.of("a","b","c");
		stream1.forEach(System.out::print);
		System.out.println("----------------------------------------");
//		for(String s:stream1) {
//			System.out.println(s);
//		}
	}

}
