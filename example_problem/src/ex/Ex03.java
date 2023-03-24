package ex;

public class Ex03 {
	public static void main(String[] args) {
		int[] numbers1 = {5,3,4,2,1};		
		// 배열의 중복 제거
		int lotteNum = 0;
		for(int num : numbers1) {
			if(num == lotteNum){
				
			}
		}
		
		
		int[] numbers = {5,3,4,2,1};
		// 배열의 값을 정렬하고 싶어요!
		// for문 2개 사용
		// 방을 바꾸기 위해 새로운 변수를 선언하고 이용합니다.
		// 스트링의 인덱스도 0번부터 시작
		String str = "안녕하세요!!";
		
		// str.charAt() 문자열 위치  알기
		System.out.println(str.charAt(0));
		// 문자열 끊기
		System.out.println(str.length());
		// 시작 인덱스, 끝 인덱스
		// 끝 인덱스가 길 경우 변수.length() 사용
		System.err.println(str.substring(2, 7));
		
	}
}
