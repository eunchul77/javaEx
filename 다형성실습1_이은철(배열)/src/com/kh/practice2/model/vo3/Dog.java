package com.kh.practice2.model.vo3;

public class Dog extends Animal{

	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	

	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		setWeight(weight);
	}


	@Override
	public void speak() {
		// 부모 메서드 호출
		// String str = super.toString(); // 이렇게 변수로 선언해서 받아도 됨! 
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다.");
		// TODO Auto-generated method stub
		
	}


	public int getWeight() {
		return weight;
	}


	public void setWeight(int weight) {
		this.weight = weight;
	}



	
}
