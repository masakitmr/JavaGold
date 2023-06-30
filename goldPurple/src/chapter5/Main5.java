package chapter5;

import java.util.Arrays;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
		List<String> words=Arrays.asList("Panaka","Pato");
//		匿名
		/*words.replaceAll(new UnaryOperator<String>() {
			public String apply(String str) {
				return str.toUpperCase();
			}
		});*/
//		ラムダ
		/*words.replaceAll((String str) ->{
			return str.toUpperCase(); } );*/
		/*words.replaceAll((str) ->{
			return str.toUpperCase(); } );*/
		/*words.replaceAll((var str)->{
			return str.toUpperCase(); } );*/
//		ラムダ超省略
		words.replaceAll(str->str.toUpperCase());
//		通常
//		for(int i=0; i<words.size();i++) {
//			words.set(i, words.get(i).toUpperCase());
//		}

		System.out.println(words);
	}
}
































































































































