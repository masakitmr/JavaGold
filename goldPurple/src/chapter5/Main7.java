package chapter5;

import java.util.function.Function;

public class Main7 {

	public static void main(String[] args) {
//		匿名
		String str1=new Function<String,String>(){
			public String apply(String str) {
				return "Hello " + str;
			}
		}.apply("naoki");
		System.out.println("匿名クラス"+str1);
//	ラムダ
	Function<String,String> f2=(String str) ->{
		return "Hello "+str;};
		String str2=f2.apply("naoki");
		System.out.println("ラムダ"+str2);

//		省略ラムダ
		Function<String,String> f3=str->
			"Hello "+str;
			String str3=f3.apply("naoki");
			System.out.println("省略ラムダ"+str3);

		}
	}
