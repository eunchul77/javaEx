package bmiEx;

public class varEx {

	public static void main(String[] args) {
		
		int value = 0;
		
		// == 비교 연산자(같다)
		// 변수의 사용범위 - 코드블록을 벗어나면 사라진다.
		// value 값이 0이면 코드블록을 실행
		if(value == 0) {
			int value2 = value + 20;
		}
		int sum = value;
		
		
		//int sum2 = value2; // if에서 선언한 value2가 코드블록을 벗어낫기 때문에 사용할 수 없음
		
	}

}
