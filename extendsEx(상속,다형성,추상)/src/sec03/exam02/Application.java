package sec03.exam02;

public class Application {
	
	public static void main(String[] args) {
		Animal cat = new Cat();
		Animal dog = new Dog();
		// 부모타입으로 형변환이 가능하다.
		
		cat.sound();
		dog.sound();
		
		cat.print(cat);
	}
}
