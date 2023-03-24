package com.kh.object1.practice;

public class Book {

	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	public Book() {
		this(null,0,0.0,null);
		
	}

	public Book(String title, int price, double discountRate, String author) {
		// 초기화
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
	}
	
	public String imformation() {
		return null;
		
	}

	public void print() {
		System.out.println(getTitle() + "\t" + getPrice() + "\t" + getDiscountRate() + "\t" + getAuthor());
	}
	
	public void res() {
		System.out.println("도서명 = " + getTitle());
		int ress = (int)(getPrice() - getPrice() * (getDiscountRate()));
		System.out.println("할인된 가격 = " + ress + "원");
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
}
