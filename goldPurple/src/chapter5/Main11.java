package chapter5;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Main11 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,1,2);

//		匿名
		Consumer<List<Integer>> tokumei=new Consumer<List<Integer>>() {
			public void accept(List<Integer> list) {
				Collections.sort(list);
			}
		};
		tokumei.accept(list);
		System.out.println("匿名"+list);
//		ラムダ
		Consumer<List<Integer>> ramuda=lambdaList -> Collections.sort(lambdaList);
		ramuda.accept(list);
		System.out.println("ラムダ"+list);
		Comparator<Integer> comp=(x,y)->Integer.compare(x,y);
		System.out.println(comp.compare(1, 2));
//		staticメソッド参照
		Consumer<List<Integer>> stametho=Collections::sort;
		stametho.accept(list);
		System.out.println("スタメソ"+list);
		Comparator<Integer> comp2=Integer::compare;
		System.out.println(comp2.compare(2, 1));
	}
}
