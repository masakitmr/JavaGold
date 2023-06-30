package chapter5;

import java.util.List;
import java.util.function.UnaryOperator;

public class Main13 {

	public static void main(String[] args) {
//		拡張for
		List<Integer> list=List.of(3,1,2);
		for(int a:list) {
			System.out.print("拡張for"+a);
		}
		System.out.println();
//		ラムダ
		System.out.print("ラムダ");
		list.forEach(a->System.out.print(a));
		System.out.println();
		UnaryOperator<String> obj=s-> s.toUpperCase();
		System.out.println("ラムダ"+obj.apply("masaki"));
//		メソッド参照
		System.out.print("メソッド参照");
		list.forEach(System.out::print);
//		UnaryOperator<String> obj2=s::toUppercase;
		UnaryOperator<String> obj2=String::toUpperCase;
		System.out.println(obj2.apply("naoki"));
	}
}