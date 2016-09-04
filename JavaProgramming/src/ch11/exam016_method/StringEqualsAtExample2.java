package ch11.exam016_method;

public class StringEqualsAtExample2 {
	public static void main(String[] args) {
		String strVar1 = new String("한주은");
		String strVar2 = "한주은";
		String strVar3 = "한주은";
		
		if(strVar1 == strVar2) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
			
		}
		
		if(strVar2 == strVar3) {
			System.out.println("같은 String 객체를 참조");
		} else {
			System.out.println("다른 String 객체를 참조");
			
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("같은 문자열을 가짐 ");
		} else {
			System.out.println("다른 문자열을 가짐");
		}
		
	}
}
