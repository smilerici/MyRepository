package ch14.sec03.exam01_no_arguments_no_return;

public class MyFuctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");};
		fi.method();
		
		fi = () -> System.out.println("method call3");
		fi.method();
		
		fi = new MyFunctionalInterface() {
			public void method() {
				System.out.println("method call4");
			};
		};
		fi.method();
	}
}
