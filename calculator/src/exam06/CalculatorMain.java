package exam06;

public class CalculatorMain {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		double rectangle = calc.areaRectangle(10);
		
		// 정사각형의 넓이
		System.out.println("정사각형의 넓이 : " + rectangle);
		//직사각형의 넓이
		System.out.println("직사각형의 넓이 : " + calc.areaRectangle(10, 20));
		
	}

}
