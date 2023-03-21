package arrayEx;

public class ArrayIndexOutOfBoundsEx {

	public static void main(String[] args) {
		// 배열 선언
		int[] score;
		// 배열을 선언한 후 중괄호를 사용해서 값을 입력하면 오류가 발생
		// score = {10, 20, 30}; <--오류발생
		
		// 배열 선언후 생성하는 방법.1
		// 변수명 = new 타입[] {값 목록};
		score = new int[] {10, 20, 30};
		
		// 배열 선언후 생성하는 방법.2
		// 값의 목록이 없지만 미리 배열을 만드는 경우
		// 타입[] 변수 = new 타입[길이]
		score = new int[10]; // 몇개(10개 :0~9)의 칸을 만들어줘
		// 기본타입 = 0 기본값 // 참조타입 = null 기본값
		System.out.println("int타입을 저장할 10개의 저장공간을 만들었어요!");
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		
		// java.lang.ArrayIndexOutOfBoundsException:
		// 배열의 인덱스는 0부터 시작한다.
		// 배열의 총 길이는 갯수를 반환 한다.
		// 배열의 index를 초과하는 방번호가 입력된 경우
		// int sum = score[3]; // 오류 발생(인덱스 방번호가 0, 1, 2 이므로 3이 없음)
	}
	
}
