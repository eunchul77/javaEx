package arrayEx;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		int[] score = {50, 80, 95, 75, 85}; 
		int sum = 0;
		
		for(int i=0;i<score.length;i++) {
			sum += score[i];
			System.out.println(score[i]);
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum/score.length);
	}

}
