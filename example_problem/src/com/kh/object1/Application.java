package com.kh.object1;

import com.kh.object1.practice.Book;

public class Application {

	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		book.print();
		book1.print();
	
		System.out.println("==================================");
		System.out.println("수정된 결과 확인");
		
		
		book.setTitle("C언어");
		book.setPrice(30000);
		book.setDiscountRate(0.1);
		book.setAuthor("홍길동");
		
		
		book.print();
		
		System.out.println("==================================");
		book.res();
		book1.res();

	}

}
