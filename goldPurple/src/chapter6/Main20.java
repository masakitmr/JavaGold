package chapter6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main20 {

	public static void main(String[] args) {
		Stream<String> streaml=Stream.of("naoki","akko","ami");
		List<String> result1=streaml.collect(Collectors.toList());
		System.out.println(result1);

		Stream<String> stream2=Stream.of("naoki","akko","ami");
		String result2=stream2.collect(Collectors.joining(" | "));
		System.out.println(result2);

		Stream<String> stream3=Stream.of("naoki","akko","ami");
		Integer result3 =stream3.collect(Collectors.summingInt(t->t.length()));
		System.out.println(result3);

		Stream<String> stream4=Stream.of("naoki","akko","ami");
		Double result4=stream4.collect(Collectors.averagingInt(t->t.length()));
		System.out.println(result4);
	}

}
