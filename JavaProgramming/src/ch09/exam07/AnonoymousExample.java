package ch09.exam07;

public class AnonoymousExample {
	public static void main(String[] args) {
		Anoynymous anony = new Anoynymous();
		
		anony.field.wake();
		
		anony.method1();
		
		anony.method2(new Person() {
			String studentNo;
			void study() {
				System.out.println("공부합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}	
		});
	}
}
