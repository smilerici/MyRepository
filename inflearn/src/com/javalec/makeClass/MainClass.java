package com.javalec.makeClass;

public class MainClass {
	public static void main(String[] args) {
		ManClass mc = new ManClass();
		ManClass mc1 = new ManClass(15,160,50,"010-1111-0000");
		
		mc.getAge();
		
		double d = mc.calculateBMI();
	}
}
