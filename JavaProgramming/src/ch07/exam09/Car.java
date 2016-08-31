package ch07.exam09;

public class Car {
	Tire frontLeftTire = new Tire("앞왼쪽",6);
	Tire frontRightTire = new Tire("앞오른쪽",2);
	Tire backLeftTire = new Tire("뒤왼쪽",3);
	Tire backRightTire = new Tire("뒤 오른쪽",4);
	
	int run() {
		System.out.println("[자동차가 달립니다.]");
		if(frontLeftTire.roll() == false) {
			stop(); 
			return 1;
		}
		
		System.out.println("[자동차가 달립니다.]");
		if(frontRightTire.roll() == false) {
			stop(); 
			return 2;
		}
		
		System.out.println("[자동차가 달립니다.]");
		if(backLeftTire.roll() == false) {
			stop(); 
			return 3;
		}
		
		System.out.println("[자동차가 달립니다.]");
		if(backRightTire.roll() == false) {
			stop(); 
			return 4;
		}
		return 0;
	}
	
	void stop() {
		System.out.println("자동차가 멈춥니다.");
	}
}
