package arrayEx;

public class ArrayEx13 {

	public static void main(String[] args) {
		int[] scores = {80, 90, 70, 100};
		
		int sum = 0;
		for(int data : scores) {
			//System.out.println(data);
			sum += data;
		}
		System.out.println("점수의 총합 : " + sum);
		System.out.println("평균 점수 : " + (sum/scores.length));
	}
	
}
