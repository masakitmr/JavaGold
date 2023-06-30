package chapter6;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main14 {

	public static void main(String[] args) {
		Stream<String> streamla=Stream.of("naoki","akko","ami");
		Stream<String> streamlb=streamla.map(s->s.toUpperCase());
		streamlb.forEach(x -> System.out.print(x+" "));
//		streamla.forEach(x -> System.out.print(x+" "));
		System.out.println();

		Stream<String> stream2s=Stream.of("naoki","akko","ami");
		Stream<Integer> stream2i=stream2s.map(s->s.length());
		stream2i.forEach(x->System.out.print(x+" "));
		System.out.println();

		IntStream stream3a=IntStream.of(1,2,3);
		IntStream stream3b=stream3a.map(n -> n*10);
		stream3b.forEach(x->System.out.print(x+" "));
	}
}
