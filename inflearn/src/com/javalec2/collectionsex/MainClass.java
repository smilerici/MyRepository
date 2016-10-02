package com.javalec2.collectionsex;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("str0");
		arrayList.add("str1");
		arrayList.add("str2");
		arrayList.add("str3");
		System.out.println(arrayList.toString());
		
		arrayList.set(2, "str22222");
		System.out.println(arrayList.toString());
		
		arrayList.remove(2);
		System.out.println(arrayList.toString());
		
		System.out.println(arrayList.size());
		
		arrayList.clear();
		System.out.println(arrayList.toString());
		
		arrayList = null;
		System.out.println(arrayList);
		
		System.out.println("*************************");
		
		HashMap<Integer,String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(0,"str0");
		hashMap.put(1,"str1");
		hashMap.put(2,"str2");
		hashMap.put(3,"str3");
		
		System.out.println(hashMap.toString());
		
		hashMap.remove(2);
		
		System.out.println(hashMap.toString());
		
		hashMap.clear();
		System.out.println(hashMap.toString());
		
		hashMap.put(0,"str0");
		hashMap.put(1,"str1");
		hashMap.put(2,"str2");
		hashMap.put(3,"str3");
		System.out.println(hashMap.toString());
		
		Iterator<Integer> iterator  = hashMap.keySet().iterator();
		while(iterator.hasNext()) {
			System.out.println(hashMap.get(iterator.next()));
		}
		
		System.out.println("*************************");
		
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("홍길동",3));
		hashSet.add(new Student("이순신",6));
		hashSet.add(new Student("장보고",1));
		
		Student student = new Student("이순신",6);
		hashSet.remove(student);
		
		System.out.println(hashSet.toString());
		
		
	}
}
