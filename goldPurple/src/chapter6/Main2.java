package chapter6;

import java.util.Arrays;
import java.util.List;

public class Main2 {

	public static void main(String[] args) {
		List<String> datal=Arrays.asList("mana","naoki","ryo");
		boolean result1=datal.stream().allMatch(s -> s.length() >= 3);
		boolean result2=datal.stream().anyMatch(s -> s.length() == 4);
		boolean result3=datal.stream().noneMatch(s -> s.length() == 4);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

//		Stream<String> stream1=datal.stream();
//		boolean result4=stream1.allMatch(s -> s.length() >= 3);
//		boolean result5=stream1.anyMatch(s -> s.length() == 4);
	}

}
