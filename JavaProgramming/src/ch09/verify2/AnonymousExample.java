package ch09.verify2;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonyoums anony = new Anonyoums();
		anony.field.run();
		anony.method1();
		anony.method2(new Vehicle() {

			@Override
			public void run() {
				System.out.println("트럭이 달립니다.");
			}
			
		}
				
				
				
		);	
	}
}
