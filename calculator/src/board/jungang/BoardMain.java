package board.jungang;

public class BoardMain {

	public static void main(String[] args) {

//		int[] intArr1 = {1,2,3,4,5};
		
		int[] intArr = new int[5];
		intArr[0] = 1;
		intArr[1] = 2;
		intArr[2] = 3;
		intArr[3] = 4;
		intArr[4] = 5;
	
		// [] : 배열
		// 타입[] 변수 = new 타입[갯수];
		Board[] boardArr = new Board[5];
		boardArr[0] = new Board("게시글1", "일초");
		boardArr[1] = new Board("게시글2", "이초");
		boardArr[2] = new Board("게시글3", "삼초");
		boardArr[3] = new Board("게시글4", "사초");
		boardArr[4] = new Board("게시글5", "오초");
		
		for(Board board : boardArr ) {
			System.out.println("title====================");
			System.out.println(board.title);
			System.out.println(board.content);
			System.out.println(board.writer);
			System.out.println(board.date);
			System.out.println(board.hitcount);
			
		}
		

			
		// 게시글을 생성
		Board myBoard1 = new Board("게시글1","너무어려워요", "홍길동","23-03-22",10); 
		Board myBoard2 = new Board("게시글2","너무어려워요", "홍길동","23-03-22",10); 
		Board myBoard3 = new Board("게시글3","너무어려워요", "홍길동","23-03-22",10); 
		Board myBoard4 = new Board("게시글4","너무어려워요", "홍길동","23-03-22",10); 
		Board myBoard5 = new Board("게시글5","너무어려워요", "홍길동","23-03-22",10); 
		
		// 배열생성
		Board[] boardList = new Board[10];
		boardList[0] = myBoard1;
		boardList[1] = myBoard2;
		boardList[2] = myBoard3;
		boardList[3] = myBoard4;
		boardList[4] = myBoard5;
		
		// 게시글리스트 생성
		BoardList boardList1 = new BoardList(boardList);
		
	}

}

