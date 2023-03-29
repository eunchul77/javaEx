package sec01.exam05;

// 인터페이스로 자동 형변환이 가능 
public class Bus implements Vehicle{

	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}

	public void checkFare() {
		System.out.println("승차요금을 결제합니다.");
	}
}
