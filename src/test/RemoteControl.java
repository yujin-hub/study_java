package test;

public interface RemoteControl {
	
	// 상수 : max_volume, min_volume, 초기값 10, 0
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;

	// 추상메서드 : turnon, furnoff, setvolume
	public abstract void turnON();
	void turnOFF();
	void setVolume(int volume);
	
	// 디폴트메서드 : setmute
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적메서드 : changeBattery
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
	
}
