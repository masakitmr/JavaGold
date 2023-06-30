package chapter6;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Main19 {

	public static void main(String[] args) {
		IntStream streamli=IntStream.of(2,3,5);
		DoubleStream streamld=streamli.mapToDouble(n->n);
		System.out.println(streamld.average().getAsDouble());

		IntStream stream2i=IntStream.of(2,3,5);
		DoubleStream stream2d=stream2i.asDoubleStream();
		System.out.println(stream2d.average().getAsDouble());
	}

}
