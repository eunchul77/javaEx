package com.jungang;

public class Calculator {

	// 필드
	// 접근제한자를 붙이지 않으면 default가 된다.(default = 패키지 내에서 접근할수있음)
	private String name; // private = 외부로부터 보호 
	
	// 생성자의 특징 2가지
	// 1. 클래스명과 동일하다. 
	// 2. 반환타입이 없다. 
	// 생성자 :new 연산자를 만나서 객체가 생성될 때 실행된다.
	// 안만들면 자동으로 만들어준다. (지금은 내가 직접 만든것)
	public Calculator() {
		name = "정수계산기";
		System.out.println(name);
	}
	
	// 접근제한자 반환타입 메서드명(매개변수){}
	// 정수의 합계를 구하는 메서드 2개의 수를 입력받아 2개의 합을 반환 
	
	/**
	 * 2개의 정수를 입력받아 두수의 합을 반환 합니다.
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	
	public int add(int num1, int num2) {
		return num1 + num2;
		
	}
	
}
