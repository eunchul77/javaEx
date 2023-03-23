package test.jungang;

public class Test3 {

	String name;
	String gender;
	int age;
	int weigth;

	public Test3(String name, String gender, int age) {
		this(name, gender, age, 150);
		this.name = name;
		this.gender = gender;
		this.age = age;

	}

	public Test3(String name, String gender, int age, int weigth) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.weigth = weigth;

	}
}
