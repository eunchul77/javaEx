package forEx;

public class EvenNumber {

	public static void main(String[] args) {

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
