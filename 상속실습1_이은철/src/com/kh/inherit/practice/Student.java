package com.kh.inherit.practice;

public class Student extends Person{

	private int grade; // 학년
	private String major; // 전공
	
	public Student() {
		
	}
	
	// 초기화 : 생성자의 매개변수를 필드에 입력합니다.
	public Student(String name, int age, double height,double weight, int grade, String major) {
		super(age, height, weight); // 부모 생성자를 호출 
		super.name = name; // pretected : 패키지가 달라도 부모자식 관계면 접근가능
		// super.age : 패키지가 달라도 부모자식 관계면 접근 가능
		this.grade = grade;
		this.major = major;
	}

	
	public String information() {
		
		return super.information() + " " + getGrade() + " " + getName();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
}
