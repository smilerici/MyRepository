package ch09.exam01;

public class A {
	A() {
		System.out.println("A객체가 생성됨");
		
		B b = new B();
		b.field1 = 3;
		b.method1();
	}
	
	class B {
		int field1;
		//static int field2; //static 필드 선언불가
		B() {
			System.out.println("B객체가 생성됨");
		}
		void method1() {
			
		}
		
		//static void method2() {
		//	
		//}   static 메소드 선언불가
	}
	
	static class C {
		int field1;
		static int field2;
		C() {
			System.out.println("C객체가 생성됨");
		}
		void method1() {
			
		}
		static void method2() {
			
		}
	}
	
	void method() { //이 클래스는 method 안에서만 사용 가능
		class D {
			int field1;
			//static int field2;     static 안됨
			D() {
				System.out.println("D객체가 생성됨");
			}
			void method1() {
				
			}
			//static void method2() {
			//	
			//}    static 안됨    
			
		}
		
		D d= new D();
		d.field1 = 3;
		d.method1();
	}
	
	
}
