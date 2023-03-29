package sec01.exam02;

import sec01.exam01.Audio;

public class Application {
	public static void main(String[] args) {
		// 기본 생성자를 이용하여 객체를 생성후 레퍼런스 변수
		// 참조타입 변수에 저장
		MyClass mc = new MyClass();
		// 1.1. mc의 필드에 접근하여 메소드 호출(smartTV생성되어 있음)
		// smartTV
		mc.rc.turnOn();
		mc.rc.setVolume(11);
		mc.rc.turnOff();
		
		// 1.2. 필드에 새로운 객체를 생성하여 저장
		mc.rc = new Audio();
		mc.rc.turnOn();
		mc.rc.setVolume(11);
		mc.rc.turnOff();
		System.out.println("==================================");
		// 2. 인터페이스가 생성자의 매개변수로 이용된 경우
		MyClass mc1 = new MyClass(new Audio());
		mc1.rc.turnOn();
		mc1.rc.setVolume(5);
		mc1.rc.turnOff();
		System.out.println("==================================");

		// 3. 인터페이스가 메서드의 매개변수로 이용된 경우
		// ㅇ기본생성자로 생성하면 rc는 SmartTV()로 생성 됩니다. 
		// 필드의 선언부에서 생성하고 있습니다.
		MyClass mc2 = new MyClass();
		// 원래는 스마트tv였는데 오디오로 변경되는 과정
		// 인터페이스가 메서드의 매개변수 타입으로 사용될경우
		// 메서드 호출시 구현 객체를 매개값으로 대입합니다.
		mc2.methodB(new Audio());
		mc2.rc.turnOn();
		mc2.rc.setVolume(5);
		mc2.rc.turnOff();
		System.out.println("==================================");
		
		MyClass mc3 = new MyClass();
		// 4. 메서드에 선언된 로컬변수로 rc에 저장
		mc3.methodA();
		mc3.rc.turnOn();
		mc3.rc.setVolume(5);
		mc3.rc.turnOff();
	}

}
