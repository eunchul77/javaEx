package sec01.exam01;

public interface RemoteControl {
	// 생성자를 가질 수 없다.
	// 인스턴스 필드도 가질수없음
	// -> 상수 사용 가능
	// 추상메소드를 가지고 있음

	// static final 을 자동으로 붙여준다.
	// 상수 : 대문자로 작성하고 문자가 연결될 경우 _ 이용
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상메소드 
	void turnOn();
	void turnOff();
	void setVolume(int volume);
}
