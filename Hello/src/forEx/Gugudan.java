package forEx;

public class Gugudan {

	public static void main(String[] args) {
		// 중첩(이중)반복문을 이용하여 구구단 출력하기
		// for(초기식; 조건식; 증감식){} // for문법
		// i를 1~9까지 출력 해보기
		// break문, continue문 차이 확인하기!

		Outte : //Label : 문법 
		
		for (int dan = 2; dan < 10; dan++) { // dan : 2~9
			System.out.println(dan + "단");
			//for 시작
			// for문의 int값은 지역변수, 코드블럭을 벗어나면 사라짐(초기화)
			for (int i = 1; i < 10; i++) { // i : 1~9
				if(dan==6) { 
					break Outte; // 이쪽으로 반복문 아예 탈출 // Label문을 이용 안했다면 6단만 출력하지 않음
				}
				// System.out.println("i=" + i);
				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
				
			} // for 종료
			System.out.println();
//			if(dan==6) { // 6단을 출력한 후 반복문을 탈출 합니다.
//				break;
//			}
		} // for문 종료
		// 1~10까지의 수 중에서 짝수에 합을 구해봅시다
		System.out.println("======짝수의 합 구하기======");
		int sum = 0;
		for(int i = 2; i < 11; i++ ) {
			// 홀수이면 증감식으로 넘어갑니다!
			// % 나머지 연산자로 홀수 짝수를 구하기
			if(i % 2 == 1) {
				continue; // 증감식으로 이동하기(for문으로 이동)
			}
			System.out.println("i=" + i);
			sum += i; // sum = sum + i
			
		}
		System.out.println("1~10까지 짝수의 합계 : " + sum);

	}

}
