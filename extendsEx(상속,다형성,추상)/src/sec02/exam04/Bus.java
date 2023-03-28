package sec02.exam04;

public class Bus extends Vehicle{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run(); // 부모의 메서드 호출
		System.out.println("버스가 달립니다.");
	}
}
