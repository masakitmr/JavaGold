package chapter5;

import java.util.function.LongPredicate;

public class Main22 {

	public static void main(String[] args) {
		LongPredicate p1=n->(n%3)==0;
		LongPredicate p2=n->(n%5)==0;
		LongPredicate p3=p1.or(p2);
		System.out.println(p3.test(5));

		LongPredicate p4=p1.and(p2);
		System.out.println(p4.test(5));

		LongPredicate p5=p4.negate();
		System.out.println(p5.test(5));
	}

}
