package com.kh.object2;

import com.kh.object2.practice.Book;

public class Application {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("자바의정석", 20000, 0.2, "윤상섭");
		
		book1.print();
		book2.print();
		
		System.out.println("==========================================");
		
		book1.setTitle("C언어");
		book1.setPrice(30000);
		book1.setDiscountRate(0.1);
		book1.setAuthor("홍길동");
		
		
		book1.print();
		
		System.out.println("==========================================");
		
		book1.print2();
		book2.print2();
		
		
	}

}
