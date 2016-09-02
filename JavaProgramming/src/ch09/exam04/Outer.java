package ch09.exam04;

public class Outer {
	//자바7이전
	public void method1(final int arg) {
		final int localVariable = 1;
		class inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
	//자바8이후
	public void method2(int arg) {
		int localVariable = 1;
		// arg = 100; final 특성을 갖기 떄문에 안됨
		// localVariable = 100; final 특성을 갖기 때문에 안됨
		// inner 클래스에서 사용하지 않았다면 매개,로컬 변수 변경 가능
		class inner {
			void method() {
				int result = arg + localVariable;
			}
		}
	}
}
