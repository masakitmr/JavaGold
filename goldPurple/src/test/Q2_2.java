package test;

import java.util.HashSet;
import java.util.Set;

public class Q2_2 {

	public static void main(String[] args) {
		System.out.println(getData());
	}

	@SuppressWarnings("unchecked")
	public static Set getData() {
		Set set=new HashSet();
		set.add(10); set.add(20);
		return set;
	}
}
