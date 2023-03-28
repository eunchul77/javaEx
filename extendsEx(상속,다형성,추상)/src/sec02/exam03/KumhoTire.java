package sec02.exam03;

public class KumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		// 부모가 가진 생성자를 호출
		// 생성자를 만들면 기본생성자가 생성되지 않습니다.
		
		super(location, maxRotation + 2);
	}

	@Override
	public boolean roll() {
		rotation++; // 타이어 1회전
		System.out.println("***** 금호타이어 " + location +"누적 회전수 : " + rotation);
		System.out.println("***** 금호타이어 " + location + "최대 회전수 : " + maxRotation);
		if(rotation >= maxRotation) {
			return false;
		}
		return true;

	}


}
