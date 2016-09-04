package ch11.exam07;

import java.util.*;

public class HashCodeExample {
	public static void main(String[] args) {
		
	}
	
	static class Student {
		int sno;
		String name;
		
		public Student(int sno,String name) {
			this.sno = sno;
			this.name = name;
		}
		
		@Override
		public int hashCode() {
			return Objects.hash(sno,name);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Student) {
				Student s = (Student) obj;
				if(s.sno==this.sno) {
					if(s.name.equals(this.name)) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
