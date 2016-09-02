package ch09.exam07;

public class Anoynymous {
	Person field = new Person() {
		String studentNo;
		void work() {
			System.out.println("출근합니다.");
		}
		
		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		};
	};
	
	void method1() {
		Person localVar = new Person() {
			String studentNo;
			void walk() {
				System.out.println("산책합니다.");
			}
			
			@Override
			void wake() {
				System.out.println("7시에 일어납니다.");
				walk();
			};
		};
		localVar.wake();
		}
	
	void method2(Person person) {
		person.wake();
	}
	}

