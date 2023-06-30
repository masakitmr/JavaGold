package chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main24 {

	public static void main(String[] args) {
		Arrays.asList("a","b","c","d","e")
		.parallelStream()
		.forEachOrdered(s -> System.out.print(s+" "));
		System.out.println();
		List<String> list=new CopyOnWriteArrayList<String>();
		Arrays.asList("a","b","c","d","e")
		.parallelStream()
		.map(s->{list.add(s); return s.toUpperCase(); })
		.forEachOrdered(s-> System.out.print(s+" "));
		System.out.println();
		for(String s:list) {
			System.out.print(s+" ");
		}
	}
}
