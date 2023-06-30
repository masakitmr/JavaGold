package chapter6;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main23 {

	public static void main(String[] args) {
		Stream<String> stream1=Stream.of("nao","akko","ami");
		Map<String,Integer> map1=stream1.collect(
				Collectors.toMap(s->s,String::length));
		System.out.println(map1);

		Stream<String> stream2=Stream.of("nao","akko","ami");
		Map<Integer,String> map2=stream2.collect(
				Collectors.toMap(String::length,s->s,(s1,s2)->s1+":"+s2));
		System.out.println(map2);
		System.out.println(map2.getClass());

		Stream<String> stream3=Stream.of("nao","akko","ami");
		Map<Integer,String> map3=stream3.collect(
				Collectors.toMap(String::length, s->s,(s1,s2)->s1+" : "+s2,TreeMap::new));
		System.out.println(map3);
		System.out.println(map3.getClass());
	}

}
