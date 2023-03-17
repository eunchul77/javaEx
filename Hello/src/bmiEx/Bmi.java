// 패키지 선언
package bmiEx;

// 클래스 선언문
// 접근제한자 class 클래스명
public class Bmi {
	// 클래스 안에 들어있는 변수 = 필드
	// 속성을 정의
	
	// 메인메소드 - 실행 담당
	// 메서드의 선언문
	// 접근제한자 리턴타입 메소드명 (매개변수의타입 변수명)
	// void : 리턴타입이 없는경우 (메인메소드는 리턴이 없구나~)
	
	/*
	변수의 사용범위 :
	시작블록{이후 선언된 변수는 종료블록을} 만나면 사라진다.
	메서드 내부에 선언된 변수는 블럭 내부 에서만 사용가능한 변수이다.
	다른 명령문장에서 블럭이 열리면 마찬가지롭 블록 내부에서만 사용 가능하다
	*/
	public static void main(String[] args) {
		
		// 키 1.6, 몸무게 50kg
		// int (정수)
		// double (실수)
		double bmi = 50 / (1.6*1.6);
		System.out.println("당신의 Bmi는..." + bmi);
		
		// 정수를 담을 수 있는 value라는 변수 선언
		int value;
		
		// 정수 변수 sum을 생성하고 20으로 초기화
		// value를 10으로 초기화
		int sum = 20;
		value = 10;
		
		// sum에 value 값과 20을 더해줍니다.
		sum = sum + value;
		
		// 진실의 문
		// 만약에 ()안의 조건이 참이라면 {} 코드블록을 실행
		// if(조건문){}
		// 참/거짓 true(참) false(거짓)
		if(1<0) {
			System.out.println("1<0");
		}
		if(true) {
			System.out.println(true);
			System.out.println("true");
		}
		if(false) {
			System.out.println(false);
			System.out.println("false");
		}
		
		
		}
		
		
	}

