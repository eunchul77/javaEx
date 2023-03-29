package sec01.exam02;

import sec01.exam01.Audio;
import sec01.exam01.RemoteControl;
import sec01.exam01.SmartTV;
import sec01.exam01.Television;

public class MyClass {
	// 인터페이스는 생성 할수 없다.
	// 인터페이스는 필드, 생성자, 메소드의 매개변수나 생성자, 메소드의 로컬 변수로 서언할 수있다.
	// ----> 다형성
	
	
	// 인터페이스가 필드의 타입으로 선언된 경우
	// 인터페이스의 구현체만 인터페이스를 타입으로 사용할 수있다.
	
	RemoteControl rc = new SmartTV();
	
	public MyClass() {
		
	}
	
	public MyClass(RemoteControl rc) {
		// 매개변수로 받아온 rc를 필드에 저장
		this.rc = rc;
	}
	
		public void methodA() {
			// Audio객체를 생성하여 RemotreControl타입으로 자동 형변환
			// 인터페이스의 타입으로 지역변수 생성
			RemoteControl rc = new Audio();
			// 생성된 객체를 필드에 저장
			this.rc = rc;
		}

		public void methodB(RemoteControl rc) {
			// 매개변수로 넘어온 rc를 필드에 저장
			this.rc = rc;
		}
		
	}
	

