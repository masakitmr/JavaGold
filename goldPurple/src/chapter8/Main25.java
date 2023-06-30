package chapter8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main25 {

	public static void main(String[] args) {
		List<String> data=Arrays.asList("c","a","d","b");
		Optional<String> result1=data.parallelStream().findFirst();
		Optional<String> result2=data.parallelStream().findAny();
		System.out.println(result1.get()+" "+result2.get());
	}

}
