package calc;

public class Car {
	public int gas;

	
	// 생성자 : gas 초기화
	public Car(int gas) {
		this.gas = gas;
		
	}
	
	// 달립니다. 출력
	public void run1() {
			System.out.println("달립니다.");
			// 내부 메서드를 호출 합니다.
			stop();
			// 이름, 매개변수의 갯수, 타입이 일치하는 메서드를 찾아서 실행 합니다.
			sound("빵빵");
	}
	
	// stop 멈춥니다. 출력
	public void stop() {
		System.out.println("멈춥니다.");
	}

	// sound 빵빵 출력
	public void sound(String sound) {
		System.out.println(sound);
	}


	
	
	
	// 메서드명 앞에 is 가 붙으면 boolean일 확률이 높다(국룰)
	public boolean isLeftGas() {
		 if(gas == 0) {
			 return true;
		 } else {
			 return false;
		 }
		 
	}
		
	
	
	public void run() {
		while(true) {
			if(gas>0) {
				gas --;
				System.out.println("달립니다.");
				System.out.println("남은 기름양 : " + gas);
				if(gas==0) {
					return;
				}
			} else {
				System.out.println("기름이 떨어졌어요!!");
				System.out.println("남은 기름양 : " + gas);
				//break;
				// 메서드를 강제 종료 할때 void타입에 return을 넣는다.
				return; 
			}
		}
	}

	public Car gas(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
