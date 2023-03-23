package test.jungang;

public class Test2 {

	String name;
	String gender;
	int age;
	
	public Test2(String name, int age) { // 생성자
		this(name, null,age);
		this.name = name;
		this.age = age;
		
	}

	public Test2(String name, String gender, int age) { 
		this.name = name;
		this.age = age;
		this.gender = gender;

		
	}

}
