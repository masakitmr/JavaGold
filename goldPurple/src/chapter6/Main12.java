package chapter6;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main12 {

	public static void main(String[] args) {
		Stream<String> stream1=Stream.of("ami","naoki","akko");
		stream1.filter(s -> s.startsWith("a")).forEach(x -> System.out.println(x + " "));
		System.out.println();

		Stream<String> stream2=Stream.of("","naoki","akko");
		stream2.filter(Predicate.not(s -> s.isEmpty()))
		.forEach(x -> System.out.println(x+" "));
		System.out.println();

		Stream<String> stream3 = Stream.of("ami","naoki","akko","ami");
		stream3.distinct().forEach(x -> System.out.println(x+ " "));
	}

}
