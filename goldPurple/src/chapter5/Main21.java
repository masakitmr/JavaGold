package chapter5;

import java.util.function.Function;

public class Main21 {

	public static void main(String[] args) {
		Function<String,Character> f1=s->s.charAt(0);
		Function<Character,Boolean> f2=c->Character.isUpperCase(c);
		Function<String,Boolean> f3=f1.andThen(f2);
		System.out.println(f3.apply("Java"));

		Function<String,Boolean> f4=f2.compose(f1);
//		Function<Boolean,String> f4=f1.compose(f2);
		System.out.println(f4.apply("Java"));
	}
}
