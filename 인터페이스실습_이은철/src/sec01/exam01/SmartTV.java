package sec01.exam01;

public class SmartTV extends Television implements Searchable{

	@Override
	public void turnOn() {
		System.out.println("smartTv를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("smartTv를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("TV 볼륨 : " + this.volume);

	}

	@Override
	public void search(String url) {
		System.out.println(url + " 을 검색합니다.");
	}
}
