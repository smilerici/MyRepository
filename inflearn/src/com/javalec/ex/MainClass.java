package com.javalec.ex;

public class MainClass {
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=2;j<10;j++) {
				System.out.print(j+" * "+i+" = "+(i*j)+ "\t");
				
			}
			System.out.println();
		}
		
		//배열
		System.out.println();
		int[] iArr = {10,20,30,40,50};
		System.out.println(iArr[4]);
		
		int[] jArr = new int[3];
		jArr[0] = 0;
		jArr[1] = 1;
		jArr[2] = 2;
		
		System.out.println(jArr[1]);
	}
}
