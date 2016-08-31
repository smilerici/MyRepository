package ch08.exam03;

public interface RemoteControl {
	//필드
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME = 0;//자동으로 public static final 붙음
	
	
	//static 블록 안됨
	/*static {
		MIN_VOLUME = 0;
	}*/
	
	//추상메소드
	public abstract void turnOn();
	public abstract void turnOff();
	void setVolume(int volume);//자동으로 public abstract 붙음
	
	//디폴드 메소드
	//default 를 반드시 붙여야 한다. 
	default void setMute(boolean mute) {//public 은 자동으로 붙음
		if(mute){
			System.out.println("무음 처리합니다.");
	} else {
		System.out.println("무음 해체합니다.");
	}
	}
	
	//정적 메소드
	static void changeBattery() {//public은 자동으로 붙음
			System.out.println("건전지를 교환합니다.");
		
	}
}
