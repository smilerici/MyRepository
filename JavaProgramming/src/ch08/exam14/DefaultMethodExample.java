package ch08.exam14;

public class DefaultMethodExample {
	public static void main(String[] args) {
		MyInterface mi1 = new MyClassA();
		
		mi1.method1();
		
		MyInterface mi2 = new MyClassB();
		
		mi2.method1();
		mi2.method2();
	}
}