package study.collect;

import java.util.HashMap;

public class Collection03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap
		
		//key	value
		
		//출석번호	이름
		//숫자	문자
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		map1.put(1, "김일");
		map1.put(2, "정이");
		map1.put(3, "이삼");
		
		System.out.println(map1.size());
		System.out.println(map1.containsKey(3));
		System.out.println(map1.containsKey(5));
		
		System.out.println(map1.containsValue("이삼"));
		System.out.println(map1.containsValue("박삼"));
		
		System.out.println(map1.get(1));
		
		HashMap<String, String> map2 = new HashMap<String, String>();
		map2.put("규칙1", "지각X");
		map2.put("규칙2", "결석X");
		
		System.out.println(map2.get("규칙2"));
		
//		map1.keySet()	//set -> iterator -> hashNext next
		
		System.out.println("==========map1========");
		for(int key : map1.keySet()) {
			System.out.print(key + " ");
		}
		System.out.println();
		
		System.out.println("==========map1========");
		for(String value: map1.values()) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
