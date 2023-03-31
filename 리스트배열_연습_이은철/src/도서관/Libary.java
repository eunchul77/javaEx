package 도서관;

import java.util.ArrayList;
import java.util.List;

public class Libary {

	List<Book> bList = new ArrayList<>();
	
	public  boolean bAdd(String title, String author) {
		
		Book b = new Book(title, author);
		
		return bList.add(b);
		
	}
	
	public void bRemove(int i ) {
		Book b = bList.remove(i);
		
		System.out.println(i + "의 인덱스 값에 있던 책이 삭제 되었습니다.");
		
	}
	
	
	public void bUpdate(int i ) {
		Book b = bList.get(i); // 리스트에서 가져오기
		b.setRent(true);
		
		bList.set(i, b); // 리스트에서 수정하기
		System.out.println(i + "의 있던 인덱스가 수정 되었습니다.");
	}
	
	public String print() {
	
		int i = 0;
		
		for(Book b :bList) {
			System.out.println("인덱스" + i + " : "  + b.print2());
			i++;
		}
		return super.toString();
	}
	
	
	
}
