package chapter6;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
public class Main9 {
	public static void main(String[] args) {

//		List<String> data=Arrays.asList("aaa","bb","c");
		List<String> data=Arrays.asList("");
		Optional<String> result1=data.stream().max(Comparator.naturalOrder());
		System.out.println(result1);
		Optional<String> result2=data.stream().max((d1,d2) -> d1.length() - d2.length());
		result1.ifPresent(System.out::println);
		System.out.println(result1.get());
		result2.ifPresent(System.out::println);
		System.out.println(result2.get());
	}
}
