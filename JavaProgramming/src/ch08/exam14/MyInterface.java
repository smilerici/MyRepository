package ch08.exam14;

public interface MyInterface {
	public void method1();
	//public void method2();
	public default void method2() {
		System.out.println("MyInterface - method2 실행");
	}
}
