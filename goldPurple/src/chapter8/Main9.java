package chapter8;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main9 {

	public static void main(String[] args) {
		Map<Integer,String> map=new ConcurrentHashMap<>();
		map.put(1, "tanaka");
		map.put(2, "urai");
		System.out.println(map.keySet());
		for(Integer key:map.keySet()) {
			if(key==2) {
			map.remove(key);
			}
		}
		map.put(3, "takede");
		System.out.println(map.keySet());
	}

}
