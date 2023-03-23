package board.jungang;

public class Board {
	
	String title; // 제목
	
	String content; // 내용
	
	String writer; // 작성자
	
	String date; // 작성일
	
	int hitcount; // 조회수
	
	// 클래스명과 동일
	// 반환타입이 없다.
	public Board(String title, String content) {
		this(title, content, "톰", "오늘", 150); // 생성자 중 매개변수가 가장 많은걸 호출해오기
//		this.title = title;
//		this.content = content;
//		this.writer =  "로그인한 회원 아이디";
//		this.date = "현재 컴퓨터 날짜";
//		this.hitcount = 0;
	}
	
	public Board(String title, String content, String writer, String date, int hitcount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitcount = hitcount;
		
	}


	
	
}
