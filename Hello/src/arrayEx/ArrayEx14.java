package arrayEx;

public class ArrayEx14 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 70, 100};
		// 향상된 for문을 이용해서 출력해보기
		// for(타입 변수명 : 배열){}
		
		int sum = 0;
		for(int i :scores) {
			// System.out.println("scores 안의 내용 : " + i);
			sum += i;
		}
		System.out.println("총합계 :" + sum);
		System.out.println("평균 : " + (sum/scores.length));
	}

}
