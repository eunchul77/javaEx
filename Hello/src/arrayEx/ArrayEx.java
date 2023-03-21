package arrayEx;

public class ArrayEx {

	public static void main(String[] args) {
		// 배열
		// 같은타입의 데이터를 연속된 공간에 나열하고
		// index를 부여한 자료구조
		// ※ 같은 타입만 저장이 가능하다.
		// ※ 한번 생성된 배열의 길이를 늘이거나 줄일수 없다.
		// 배열의 길이를 확인하는 방법 : 변수.length // 항목의 개수
		// 0부터 시작하는점 주의!
		
		// 배열의 선언
		// int score[]; // 둘다 가능
		// 배열 선언과 동시에 값을 입력
		int[] score = {90, 80, 60, 85, 50, 60, 70, 55, 99, 80}; // {인덱스}는 1씩 증가하며 0부터 시작
		//배열의 값을 참조하는 방법
		// 변수이름[index]
		
		// 변수이름.length : 배열의 길이를 반환
		// int j = score.length;
		//System.out.println("배열의 길이 " + score.length);
		
		int sum = 0;
		for(int i = 0; i<score.length ; i++) {
			sum += score[i];
			System.out.println("score[" + i + "] = " + score[i]);
		}
		System.out.println("점수의 합계 : " + sum);
		System.out.println("점수의 평균 : " + sum/score.length);
	}

}
