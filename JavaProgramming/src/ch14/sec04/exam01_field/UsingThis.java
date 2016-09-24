package ch14.sec04.exam01_field;

public class UsingThis {
	public int outterField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
				MyFunctionalInterface fi = () -> {
					System.out.println("outterfiled : "+outterField);
					System.out.println("outterfiled : "+UsingThis.this.outterField);
					System.out.println("innerField : "+innerField);
					System.out.println("innerField : "+this.innerField);
				};
				fi.method();
		}
		
		
	}
}
