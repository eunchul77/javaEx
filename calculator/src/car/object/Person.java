package car.object;

public class Person {

	public static void main(String[] args) {
		
		// Car : 내가 생성한 생성자(클래스명)

		Car myCar = new Car();
		myCar.company ="르노삼성";
		System.out.println("company :" +myCar.company);
		System.out.println("speedUp : " + myCar.speed);
		
		myCar.speedUp();
		System.out.println("myCar.sppeUp()");
		System.out.println("speedUp : " + myCar.speed);
		
		myCar.speed = 100;
		System.out.println("myCar.speed = 100");
		System.out.println("speedUp : " + myCar.speed);
		
		
		// 메서드 블럭안에 메서드를 또 만들수 없음
//		public void test() {
//		//오류	
//		}
				


//		Car car2 = new Car("기아자동차");
//		
//		// 필드에 접근하기 위해서는 객체가 생성되어 있어야 한다.
//		System.out.println("car.company :" + car.company);
//		car.speedUp();
//		System.out.println("car.speed : " + car.speed);
//		
//		System.out.println("car2.company : " + car2.company);
	}
	
}
