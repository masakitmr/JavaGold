package chapter5;

import java.util.function.Function;

public class Main10 {

	public static void main(String[] args) {
//		ラムダ
		Function<String,Integer> f1=str->Integer.parseInt(str);
		int num1=f1.apply("100");
		System.out.println(num1);

//		メソッド参照
		Function<String,Integer> f2=Integer::parseInt;
		int num2=f2.apply("100");
		System.out.println(num2);
	}

}
