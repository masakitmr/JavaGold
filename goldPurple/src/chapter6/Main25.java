package chapter6;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main25 {

	public static void main(String[] args) {
		Stream<String> stream1=Stream.of("belle","akko","ami","bob","nao");
		Map<String,Set<String>> map1=stream1.collect(Collectors.groupingBy(
				s->s.substring(0,1),Collectors.toSet()));
		System.out.println(map1);
		System.out.println("map1のクラス名 : "+map1.getClass());

		Stream<String> stream2=Stream.of("belle","akko","ami","bob","nao") ;
		Map<String,String> map2=stream2.collect(Collectors.groupingBy(
				s->s.substring(0,1),Collectors.joining()));
		System.out.println(map2);
		System.out.println("map2のクラス名 : "+map2.getClass());

		Stream<String> stream3=Stream.of("belle","akko","ami","bob","nao");
		Map<String,String> map3=stream3.collect(Collectors.groupingBy(s->s.substring(0,1),
				TreeMap::new,Collectors.joining()));
		System.out.println(map3);
		System.out.println("map3のクラス名 + "+map3.getClass());
	}

}
