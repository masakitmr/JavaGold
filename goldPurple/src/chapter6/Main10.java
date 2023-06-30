package chapter6;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main10 {

	public static void main(String[] args) {
		List<String> data=Arrays.asList("c","a");
		Optional<String> result1=data.stream().findFirst();
		Optional<String> result2=data.stream().findAny();
		System.out.println("result1 : " + result1.get());
		System.out.println("result2 : " + result2.get());
		Stream<String> stream=Stream.empty();
		Optional<String> result3=stream.findFirst();
		result3.ifPresent(r -> System.out.println("result3 : "+ r));
		IntStream intStream=IntStream.of(10,20,30);
		OptionalInt result4=intStream.findFirst();
		System.out.println("result4 : " + result4.getAsInt());
	}

}
