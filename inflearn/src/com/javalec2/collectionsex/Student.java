package com.javalec2.collectionsex;

public class Student {
	String name;
	int grade;
	
	public Student(String name, int grade) {
		
		this.name = name;
		this.grade = grade;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" : "+grade;
	}
	
	@Override
	public boolean equals(Object obj) {
		String compareValue = obj.toString();
		String thisValue = toString();
		return thisValue.equals(compareValue);
	}
	
	@Override
	public int hashCode() {
		return toString().hashCode();
	}
}
