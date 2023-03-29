package sec01.exam05;

public class Driver {

	public static void main(String[] args) {
		Driver dri = new Driver();
		dri.drive(new Bus());
		
		//dri.drive(new Taxi);
		
	}
	
	public void drive(Vehicle vcle) {
		vcle.run();
		// 원래 타입으로 강제형 변환
		// 객체 형변환시 castingException이 발생할 소지가 있으므로
		// 객체의 생성타입을 먼저 체크한다.
		// 객체 instanceof 타입 : 객체가 타입으로 생성되었는지를 체크
		if(vcle instanceof  Bus) {
			Bus bus = (Bus)vcle;
			bus.checkFare();
			
		}
	}
}
