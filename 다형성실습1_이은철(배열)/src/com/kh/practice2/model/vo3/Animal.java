package com.kh.practice2.model.vo3;

public abstract class Animal {

	private String name;
	private String kinds;
	
	
	protected Animal() {
		
	}


	public Animal(String name, String kinds) {
		// 초기화
		this.name = name;
		this.kinds = kinds;
	}
	
	// 문자열을 반환 하는것.
	public String toString() {
		return "저의 이름은" + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	public abstract void speak(); // 추상메소드
	
	
	
}
