package ch11.exam015_constructor;

public class KeboardToStringExample {
		public static void main(String[] args) throws Exception{
			
	byte[] bytes = new byte[100];
	
	System.out.println("입력: ");
	int readByteNo = System.in.read(bytes);
	
	String str = new String(bytes,0,readByteNo-2);
	
	System.out.println(str);
		}
}
