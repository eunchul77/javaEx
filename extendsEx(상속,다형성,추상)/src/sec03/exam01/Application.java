package sec03.exam01;

public class Application {

	public static void main(String[] args) {
		// 추상클래스는
		// 미완성된 메소드를 포함하고 있을 수있다. // 추상클래스는 그냥 생성이 안됨
		// Phone phone = new Phone();
		
		// 추상클래스를 상속받아 추상메서드를 모두 구현 하면
		// 일반클래스로 생성할 수 있다.
		SmartPhone sp = new SmartPhone("owner");
		
		// 생성은 못하지만, 참조형 변수의 타입으로 사용이 가능하다.
		// -> 다형성을 활용할 수 있다.
		Phone phone = new SmartPhone("캔디");
		sp.turnOn();
		sp.internetSearch();
		sp.turnOff();
	}
}
