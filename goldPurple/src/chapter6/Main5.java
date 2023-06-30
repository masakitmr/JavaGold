package chapter6;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Main5 {

	public static void main(String[] args) {
//		Stream<Integer> stream=Stream.of(10,20,30);
//		int result=stream.reduce(0,(a,b)->a+b);
		BinaryOperator<Integer> operator=(a,b) -> a+b;
		Stream<Integer> stream1=Stream.of(10,20,30);
		Optional<Integer> result=stream1.reduce(operator);
//		System.out.println(result);
//		int result = stream1.reduce(operator);
		result.ifPresent(System.out::println);

		Stream<Integer> stream2=Stream.empty();
		Optional<Integer> result2=stream2.reduce(operator);
		System.out.println(result2);
		result2.ifPresent(System.out::println);
	}

}
