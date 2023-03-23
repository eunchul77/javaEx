package calc;

public class Calc {
	
	public static void main(String[] args) {
		System.out.println("객체 생성");
		
		Calc calc = new Calc();
		calc.execute();
		
		//System.out.println(execute()); // void라서 출력할 수 없음.
	}
	
	
	public void execute() {
		System.out.println("execute 시작");
		double result = avg(7, 10);
		System.out.println("실행 결과 : " + result);
	}

	public double avg(int i, int j) {
		System.out.println("avg 시작");
		int sum = plus(i, j);
		System.out.println("avg 실행");
		return sum/2.0;
	}

	public int plus(int i, int j) {
		System.out.println("plus 시작");
		System.out.println("plus 실행");
		return i + j;
	}
	
}
