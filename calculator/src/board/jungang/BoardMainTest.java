package board.jungang;

public class BoardMainTest {

	public static void main(String[] args) {

//		int[] intArr = new int[5];
//		intArr[0] = 1;
//		intArr[1] = 2;
//		intArr[2] = 3;
//		intArr[3] = 4;
//		intArr[4] = 5;

		int[] intArr = new int[] {1, 2, 3, 4, 5};

//		for(int testArr : intArr) {
//			System.out.println(testArr);
//		}

		Board[] boardArr = new Board[5]; // 5개의 index(방)에 각각 null이 들어가있음
		
		// board객체를 생성하여 boardArr배열 0번째 index에 넣어줍니다.
		boardArr[0] = new Board("게시글1", "홍길동1");
		boardArr[1] = new Board("게시글2", "홍길동2");
		boardArr[2] = new Board("게시글3", "홍길동3");
		boardArr[3] = new Board("게시글4", "홍길동4");
		boardArr[4] = new Board("게시글5", "홍길동5");
		
		
		for(Board bArr : boardArr) {
			System.out.println("-------------");
			System.out.print(bArr.title);
			System.out.println(bArr.content);
		}
	}

}
