package com.jungang;

public class CalculatorMain {

	public static void main(String[] args) {
		// Calculator 객체를 생성 후 주소값을 반환
		Calculator calc = new Calculator(); // 타입 변수 = new 객체 (타입은 객체명)
		
		System.out.println("==================");
		
		// private 선언할 경우 다른 클래스에서 사용할 수 없음
//		System.out.println(calc.name);
//		calc.name = "실수계산기";
//		System.out.println("==================");
//		System.out.println(calc.name);
		
		
		// . : 주소접근연산자
		System.out.println(calc.add(5, 7));
		calc.add(5, 7);
		
		// 재사용할때는 변수에 담아주기.
		// 메서드 타이 보는방법 마우스 갖다 대보면 노란박스 최상단에 '타입, 패키지명, 클래스명, 메소드명()
		int addRes = calc.add(5, 7); // 타입은 메서드에 있는 타입을 참고해서 작성해야함 (임의작성x)
		
	}
	
}
