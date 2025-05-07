package study.collect;

import java.util.ArrayList;

public class Collection01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = new String[3];
		arr[0] = "A";
		arr[1] = "B";
		arr[2] = "C";
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(String value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
		
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> list2 = null;
		System.out.println(list.size());
//		System.out.println(list2.size());
		
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		System.out.println(list.size());
		System.out.println(list.get(2));
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		list.add(2, "A");
		list.set(3, "H");
		
		
		for(String v : list) {
			System.out.print(v + " ");
		}
		System.out.println();
		
		System.out.println(list.contains("Z"));
		System.out.println(list.contains("E"));
		
		
		int[] intArr = new int[10];
//		ArrayList<int> intList = new ArrayList<int>();
		ArrayList<Integer> intList = new ArrayList<Integer>();
//		Integer.parseInt(null);
		
		
		//포장객체 Wrapper Class
		//int -> Integer
		// double -> Double
		// boolean -> Boolean
		
		intList.add(10);
		intList.add(30);
		intList.add(50);
		
		System.out.println(intList.isEmpty());
		System.out.println(intList.size());
		
		for(int n : intList) {
			System.out.print(n + " ");
		}
		System.out.println();
	}

}
