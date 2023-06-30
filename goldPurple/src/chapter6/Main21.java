package chapter6;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main21 {

	public static void main(String[] args) {
		Stream<String> stream1=Stream.of("naoki","akko","ami");
		Set<String> set=stream1.collect(Collectors.toSet());
		System.out.println(set);

		Stream<String> stream2=Stream.of("naoki","akko","ami");
		Map<String,String> map=stream2.collect(Collectors.toMap(s->s, String::toUpperCase));
		System.out.println(map);
	}

}
