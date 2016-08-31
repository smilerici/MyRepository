package ch07.exam09copy;

public class HanKookTire extends Tire{

	public HanKookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
			++accumulatedRotation;
			if(accumulatedRotation < maxRotation) {
				System.out.println(location+" HanKookTire 수명 :"+(maxRotation - accumulatedRotation));
				return true;
			} else {
				System.out.println("***" + location +"HanKookTire 펑크 ***");
				return false;
			}
		
	}

}
