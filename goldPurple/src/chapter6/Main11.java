package chapter6;

import java.util.Optional;
import java.util.stream.Stream;

public class Main11 {

	public static void main(String[] args) {
		Stream<Double> stream=Stream.empty();
		Optional<Double> result=stream.findFirst();

		System.out.println(result.orElse(0.0));
		System.out.println(result.orElseGet(() -> Math.random()));
		System.out.println(result.orElseThrow(IllegalArgumentException::new));
		System.out.println(result.orElseThrow(() -> new IllegalArgumentException()));
	}

}
