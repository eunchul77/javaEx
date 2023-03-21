package arrayEx;

public class ArrayEx08 {

	public static void main(String[] args) {
		//이차원 배열 선언
		// new int[행개수][열개수]
		int[][] scores = new int[2][3];
		
		// 값을 가지고 오는 방법
		// scores[행번호][열번호]
		
		// 행에 값을 넣는법
		// 변수명[행번호] = new int[] {값목록};
		// 
		scores[0] = new int[] {1, 2, 3};
		scores[1] = new int[] {4, 5, 6};
		
		
		//i = 행번호, j = 열번호
		for(int i = 0; i<scores.length;i++) {
			System.out.println("i의 값 : " + i);
			int[] points = scores[i];
			System.out.println("scores[i][1] : " + points[1]); // points[] = scores[i]
			System.out.println("points의 길이 : " + points.length);
				for(int j = 0; j<points.length;j++) {
					System.out.printf("score[i][j] %d\n", points[j]);
					
				}
				System.out.println();
		}
		
	}

}
