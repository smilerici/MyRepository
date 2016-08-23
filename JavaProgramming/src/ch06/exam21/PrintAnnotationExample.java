package ch06.exam21;

import java.lang.reflect.*;

public class PrintAnnotationExample {
	public static void main(String[] args) {
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		
		for(Method method : declaredMethods) {
			if(method.isAnnotationPresent(PrintAnnotation.class)) {
				PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class); 
				
				//메소드 이름 출력
				System.out.println("["+method.getName()+"]");
				
				//구분선 출력
				for(int i=0;i<printAnnotation.number();i++) {
					System.out.print(printAnnotation.value());
				}
				System.out.println();
				
				//메소드 호출
				try {
					method.invoke(new Service());
				} catch (Exception e) {
				}
				System.out.println();
				}
		}
	}
}
