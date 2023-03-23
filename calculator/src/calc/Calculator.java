package calc;

public class Calculator {

	// true : 켜짐, false : 꺼짐
	boolean powerOn; // 초기값 펄스

	/**
	 * 전원을 키거나 끕니다.
	 */
	public void powerOn() {
		if (powerOn) { // boolean은 논리값이기 때문에 변수를 넣을 수 있음(초기값 false)
			powerOn = false;
			System.out.println("계산기를 종료 합니다.");
		} else {
			powerOn = true;
			System.out.println("계산기를 실행 합니다.");
		}
	}

	public int add(int num1, int num2) {
		if (powerOn) {
			return num1 + num2;
		} else {
			System.out.println("계산기를 실행해주세요.");
			return 0;
		}
	}

	public int add(int[] munbers) {
		int sum = 0;
		for(int num : munbers) {
			sum += num;
		}
		return sum;
	}
	
	//배열로 들어온다 
	// 바로위 배열이랑 변수명이 겹치면 오류발생(같은 배열이기 때문에)
	// int타입이 여러개 입력
	public int addFn(int ... numbers) {
		int sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		return sum;
	}
	
}
