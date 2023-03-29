package sec01.exam04;

public class Application {

	public static void main(String[] args) {
		// 다형성
		// 메소드재정의(오버라이딩)
		
		// 생성자의 매개변수의 타입으로 인터페이스를 사용하고 있으므로
		// 인터페이스의 구현체가 파라메터로 사용 됩니다.
		// 인터페이스의 구현체는 추상메서드를 모두 구현해야 하며
		// 구현체가 생성한 메서드가 실행됩니다.
		Car kcar = new Car(new kumhoTire());
		Car hcar = new Car(new HankookTire());
		kcar.run();
		System.out.println("=======================");
		hcar.run();
	}
	
}
