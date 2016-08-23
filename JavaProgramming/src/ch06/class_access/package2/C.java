package ch06.class_access.package2;

import ch06.class_access.package1.*;

public class C {
/*	//A a;(클래스에 public 안붙었으면 x 붙었으면 o)
	B b;
	
	A a1 = new A(true);
	//A a2 = new A();(x)
	//A a3 = new A("문자열");(X)
*/	
	
	public C() {

		A a = new A();
			a.field1 = 1;
			//a.field2 = 1;
			//a.field3 = 1;
			
			a.method1();
			//a.method2);
			//a.method3();
		
	}
}
