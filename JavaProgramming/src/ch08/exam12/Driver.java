package ch08.exam12;

public class Driver {
	public void drive(Vehicle vehicle){
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
