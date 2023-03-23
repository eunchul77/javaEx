package calc;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		// 매개변수의 타입과 개수가 일치하지 않을때 컴파일오류가 난다.
		int res = calc.add(5, 6);
		System.out.println(res);
		
		// 배열 생성후 메서드에 파라메터로 전달
		int[] numbers = {1,2,3,4,5};
		System.out.println("calc.add(numbers) : " + calc.add(numbers));
		
		//메서드를 생성할때 배열을 생성
		
		System.out.println("calc.add(new int[] {1,2,3}) :" + calc.add(new int[] {1,2,3}));
		
		
		;
		System.out.println("calc.addFn : " + calc.addFn(1,2,3,4,5,6,7,8,9,0,9,9,99));
	}

}
