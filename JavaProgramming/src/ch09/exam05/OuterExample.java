package ch09.exam05;

public class OuterExample {
	public static void main(String[] args) {		
		Outer outer = new Outer();
		Outer.Nested nested = outer.new Nested();
		nested.print();
	}
}
