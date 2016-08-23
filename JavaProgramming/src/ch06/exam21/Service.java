package ch06.exam21;

public class Service {
	@PrintAnnotation
	public void mathod1() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation("*")
	public void mathod2() {
		System.out.println("실행 내용1");
	}
	
	@PrintAnnotation(value="#",number=20)
	public void mathod3() {
		System.out.println("실행 내용1");
	}
}
