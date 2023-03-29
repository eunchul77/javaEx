package sec01.exam04;

public class Car {
	// new Tire는 인터페이스이기 때문에 생성 불가
	// 인터페이스의 구현체인 경우, 
	// 인터페이스를 참조변수(tire)의 타입으로 사용할 수 있다.
	//Tire tire = new HankookTire();
	Tire tire;
	
	// 생성자의 매개변수로 인터페이스가 사용된 경우
	public Car(Tire tire) { // (Tire tire)안에 들어올수 있는건 인터페이스의 구현체밖에 없다.
		this.tire = tire;
	}
	
	public void run() {
		tire.roll();
	}
	
}
