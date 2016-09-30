package com.javalec.inheritance;

public class MainClass {
	
	public static void main(String[] args) {
		
		ChildClass childClass = new ChildClass();
		System.out.print("아버님 이름 : ");
		childClass.getPapaName();
		System.out.print("어머님 이름 : ");
		childClass.getMamiName();
		
		System.out.println(childClass.cStr);
		
	}
	
}
