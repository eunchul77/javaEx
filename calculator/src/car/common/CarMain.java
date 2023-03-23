package car.common;

public class CarMain {

	public static void main(String[] args) {
		

		// 생성자를 호출 할때는 생성자의 매개변수 타입에 맞춰서 순서대로 입력해 줘야 합니다.
		Car myCar = new Car();
		System.out.println("myCar ===========");
		System.out.println(myCar.model);
		System.out.println(myCar.color);
		System.out.println(myCar.maxSpeed);
		
		
		Car myCar1 = new Car("그랜져");
		System.out.println("myCar1 ===========");
		System.out.println(myCar1.model);
		System.out.println(myCar1.color);
		System.out.println(myCar1.maxSpeed);
		
		Car myCar2 = new Car("아반떼",180);
		System.out.println("myCar2 ===========");
		System.out.println(myCar2.model);
		System.out.println(myCar2.color);
		System.out.println(myCar2.maxSpeed);

		Car myCar3 = new Car("소나타", "검정");
		System.out.println("myCar3 ===========");
		System.out.println(myCar3.model);
		System.out.println(myCar3.color);
		System.out.println(myCar3.maxSpeed);

		Car myCar4 = new Car("벤츠","흰색",3800); // 순서가 틀리면 출력값의 순서가 바뀜
		System.out.println("myCar4 ===========");
		System.out.println(myCar4.color);
		System.out.println(myCar4.model);
		System.out.println(myCar4.maxSpeed);
		
		
	}

}
