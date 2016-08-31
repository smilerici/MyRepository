package ch08.exam09;

public class Car {
	Tire[] tires = {
			new HanKookTire(),
			new HanKookTire(),
			new HanKookTire(),
			new HanKookTire()
	};
	
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
