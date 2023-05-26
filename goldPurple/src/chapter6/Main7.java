package chapter6;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main7 {

	public static void main(String[] args) {
		int[] ary1=IntStream.range(1, 10).toArray();
		int[] ary2=IntStream.rangeClosed(1, 10).toArray();
		Object[] ary3=Stream.of("a","b").toArray();
		String[] ary4=Stream.of("a","b").toArray(String[]::new);
		System.out.println("ary1 : "   + Arrays.toString(ary1));
		System.out.println("ary2 : "   + Arrays.toString(ary2));
		System.out.println("ary3 : " + ary3.getClass());
		System.out.println("ary4 : " + ary4.getClass());
	}

}
