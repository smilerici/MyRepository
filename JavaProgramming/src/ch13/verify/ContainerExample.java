package ch13.verify;

public class ContainerExample {
	public static void main(String[] args) {
		Container<String, String> container1 = new Container<String,String>();
		container1.set("홍길동", "도적");
		String name1 = container1.getkey();
		String job = container1.getvalue();
		
		Container<String, Integer> container2 = new Container<String,Integer>();
		container2.set("홍길동", 35);
		String name2 = container2.getkey();
		int age = container2.getvalue();
		
		
	}
}
