package chapter8;

import java.util.Arrays;

public class Main21 {

	public static void main(String[] args) {
		Arrays.asList("a","b","c","d","e").stream().forEach(
				s->System.out.print(s+" "));
		System.out.println();
		Arrays.asList("a","b","c","d","e").parallelStream().forEach(
				s->System.out.print(s+" "));
	}

}
