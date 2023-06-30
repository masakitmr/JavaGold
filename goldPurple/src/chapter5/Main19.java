package chapter5;

import java.util.function.IntFunction;
import java.util.function.IntSupplier;

public class Main19 {

	public static void main(String[] args) {
		IntFunction<String[]> f1=size ->new String[size];
		IntFunction<String[]> f2=String[]::new;

		String[] ans1=f1.apply(5);
		String[] ans2=f2.apply(10);

//		IntFunction f3=i->Math.random() *i;
		IntFunction<Double> f3=i->Math.random() *i;
		Double ans3=f3.apply(10);

		IntSupplier f4="Java"::length;
		int ans4=f4.getAsInt();

	}

}
