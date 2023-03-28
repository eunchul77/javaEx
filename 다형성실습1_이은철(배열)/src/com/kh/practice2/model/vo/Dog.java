package com.kh.practice2.model.vo;

public class Dog extends Animal{
	public final String  PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}
	
	public Dog(String name, String kinds, int weight) {
		super.Animal(name, kinds);
		this.weight = weight;
		
	}
	
	@Override
	public void speak() {
	super.toString();
	System.out.println("몸무게는 " +  weight + "kg입니다.");
		
	}
	
	
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	}
	
	
	
}
