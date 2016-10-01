package com.javalec2.randomex;

import java.util.*;

public class MainClass {
	public static void main(String[] args) {
		
		double d = Math.random();
		System.out.println(d);
		
		int di = (int)(d*10);
		System.out.println(di);
		
		Random random = new Random();
		int i = random.nextInt(100);
		System.out.println(i);
		
		System.out.println("*********************");
		
		System.out.print("AAA");
		System.out.println("BBB");
		
		
		System.out.println("*********************");
		Integer integer = new Integer(10);
		int k = integer.intValue();
		System.out.println(k);
		System.out.println("*********************");
		
		String str = "123";
		int l = integer.parseInt(str);
		System.out.println(l+10);
		System.out.println("*********************");
		
		
		Scanner scanner = new Scanner(System.in);
		
		String str1 = scanner.nextLine();
		System.out.println(str1);
		
		String str2 = scanner.next();
		System.out.println(str2);
		
		System.out.println("END");
		
		
	}
}
