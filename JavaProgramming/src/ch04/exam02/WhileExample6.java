package ch04.exam02;

public class WhileExample6 {
	public static void main(String[] args) throws Exception {
		boolean run = true;
		int num = 0;
		int bank = 0;

		while (run) {

			if (num != 10 && num != 13) {
				System.out.println("------------------------");
				System.out.println("1.예금 | 2.출금 | 3.종료");
				System.out.println("------------------------");
				System.out.println("선택");
			}

			num = System.in.read();

			if (num == 49) {
				bank += 1000;
				System.out.println("현재 잔액: " + bank + "원 ");
			} else if (num == 50) {
				bank -= 500;
				System.out.println("현재 잔액: " + bank + "원 ");
			} else if (num == 51) {
				System.out.println("프로그램 종료");
			}
		}

	}
}
