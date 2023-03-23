package car.common;

public class Car {

	//필드 생성
	String model;
	String color;
	int maxSpeed;
	
	// 생성자의 오버로딩
	// 매개변수의 타입, 개수, 순서가 다르게 여러개를 선언
	
	// 생성자의 특징2가지
	// 1. 클래스명이랑 동일
	// 2. 반환타입이 없음
	
	// 생성자 호출
	// this. :생성자 안에서 필드를 호출할때는 
	// this() :생성자 안에서 다른 생성자를 호출할때 
	// this()를 이용할땐 첫번째 줄에서만 가능하다
	// this()를 이용하는 이유는 중복되는 코드를 줄이기 위해서!
	// 생성자를 사용하기 위해서 매개변수에 알맞은 파라메터를 넣어준다.
	public Car() { // 매개변수가 없는것 = 기본생성자
		this("기본모델","흰색",150); // 생성자 안에서 다른 생성자를 호출할때 this()
	} 

	
	
	public Car(String model) { // 생성자 오버로딩
		// model = model // 아무 의미 없음 // 생성자 모델 = 생성자 모델
		//this.model = model; // 필드 모델 = 생성자 모델 // 생성자 model말고, 필드 model을 쓰겠다는것 
		this(model,"블랙", 150); // 현재 생성자는 model 하나밖에 없기 때문에 아래 생성자의 모든걸 다 호출할수 없음, 때문에 model은 가능하나, 나머지 2개는 직접 써야함(초기화를 원하면 null, 0)
		// 만약  초기화 하고 싶으면 null, 0을 넣자.
	} 
	public Car(String model, String color) { // 생성자 오버로딩
		// this()를 이용할땐 첫번째 줄에서만 가능하다
		this(model, color, 150);
		this.model = model;
		this.color = color;
	} 
	
	public Car(String model, String color, int maxSpeed) { // 생성자 오버로딩
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public Car(String model, int maxSpeed) { // 생성자 오버로딩
		this.model = model;
		this.maxSpeed = maxSpeed;
	}
	
	//public Car(String model, String test) {}// 생성자 오버로딩x // 변수이름이 다르다고 오버로딩이 아님 // 위에 3번째 생성자랑 겹침
}
