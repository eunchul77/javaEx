package com.kh.inherit.practice;

public class Employee extends Person {

	private int salary; // 급여
	private String dept; // 부서
	
	public Employee() {
		
	}
	
	// 초기화
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		// 부모 생성자는 첫번쨰 줄에서 호출
		super(age, height, weight);
		super.name = name;
		// this.name = name; // 이렇게도 가능, 부모클래스 때문에
		setSalary(salary);
		setDept(dept);
		
	}
	
	public String information() {
		
		return super.information() + getSalary() + " " + getDept();
	}
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}
