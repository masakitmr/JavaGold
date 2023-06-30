package chapter6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main24 {

	public static void main(String[] args) {
		Stream<String> stream=Stream.of("belle","akko","ami","bob","nao");
		Map<String,List<String>> map=stream.collect(Collectors.groupingBy(s->s.substring(0,2)));
		System.out.println(map);
 	}
}
