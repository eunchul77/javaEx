package 도서관;

public class Application {

	public static void main(String[] args) {
		
		Libary bList = new Libary();
		
		bList.bAdd("떡볶이", "이지은");
		bList.bAdd("나시고랭", "홍길동");
		bList.bAdd("국밥", "이재형");
		
		bList.print();
		System.out.println("================================");
		
		bList.bRemove(1);
		
		bList.print();
		System.out.println("================================");
		
		bList.bUpdate(1);
		
		bList.print();
		System.out.println("================================");
	}
	
	
}
