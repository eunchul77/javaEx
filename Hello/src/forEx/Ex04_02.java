package forEx;

public class Ex04_02 {

	public static void main(String[] args) {
		// 1~100까지의 정수중에서 3의 배수의 총합을 구하기
		int sum = 0;
		for(int i = 1;i<101; i++) {
			if(i%3 !=0) { 
				// 3의 배수가 아니면 증감식으로 이동
				// break; : 반복문 탈출
				// continue; : 증감식으로 이동해
				// continue이후 명령문장을 실행하지 않고 증감식으로 이동
			continue;
			}
			System.out.println("3의 배수 = " + i); // 3의 배수만 넘어올 수 있다.
			sum += i;
		}
		System.out.println("3의 배수의 합계 : " + sum);
		
	}

}
