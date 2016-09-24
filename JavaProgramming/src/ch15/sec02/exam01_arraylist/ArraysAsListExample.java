package ch15.sec02.exam01_arraylist;

import java.util.*;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동","신용권","감자바");
		for(String name : list1) {
			System.out.println(name);
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1,2,3);
		for(int value : list2) {
			System.out.println(value);
		}
		System.out.println();
	}
}
