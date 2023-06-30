package chapter6;

import java.util.stream.Stream;

public class Main4 {

	public static void main(String[] args) {

		Stream<Integer> stream=Stream.of(10,20,30);
		int result=stream.reduce(0,(a,b)->a+b);
		System.out.println(result);
	}

}
