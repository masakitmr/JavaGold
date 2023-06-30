package chapter5;

import java.util.function.BiFunction;

public class Main15 {

	public static void main(String[] args) {
//		ラムダ
		BiFunction<String,Integer,Character> bf1=(s,i) -> s.charAt(i);
		System.out.print(bf1.apply("Java", 2));
System.out.println();
		BiFunction<Integer,String,Character> bf2=(i,s) ->s.charAt(i);
		System.out.print(bf2.apply(2, "Java"));
System.out.println();
//		インスタンスメソッド参照
		BiFunction<String,Integer,Character> bf3=String::charAt;
		System.out.print(bf3.apply("Java", 2));
//		BiFunction<Integer,String,Character> bf4=String::charAt;
//		System.out.print(bf4.apply(2,"Java"));
	}
}
