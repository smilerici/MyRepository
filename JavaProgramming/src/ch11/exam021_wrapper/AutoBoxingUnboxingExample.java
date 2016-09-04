package ch11.exam021_wrapper;

public class AutoBoxingUnboxingExample {
	public static void main(String[] args) {
		Integer obj = 100;
		System.out.println("value : "+obj.intValue());
		
		//대입시 자동 Unboxing
		int value = obj;
		System.out.println("value : "+value);
		
		//연산시 자동 Unboxing
		int result = obj +100;
		System.out.println("result : "+result);
	}
}
