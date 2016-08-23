package ch06.class_access.package1;

public class B {
	/*A a;
	
	A a1 = new A(true);
	A a2 = new A();
	//A a3 = new A("문자열");(x)
	*/
	

	public B() {
		A a = new A();
		a.field1 = 1;
		a.field2 = 1;
		//a.field3 = 1;
		
		a.method1();
		a.method2();
		//a.method3();
	}
}
