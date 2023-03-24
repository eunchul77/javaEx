package com.kh.object2.practice;

public class Book {

	private String title; // 도서명
	private int price; // 가격
	private double discountRate; // 할인율
	private String author; // 저자명
	
	public Book() {
		
	}
	
	public Book(String title, int price, double discountRate, String author) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
		this.author = author;
		
	}
	
	public String information(String info) {
		return null;
	}
	
	public void print() {
		System.out.println(getTitle() + "\t" + getPrice() + "\t" + getDiscountRate() + "\t" + getAuthor());
	}

	public void print2() {
		System.out.print("도서명 = " + getTitle());
		int res = (int) (getPrice() - (getPrice() * getDiscountRate()));
		System.out.printf("\n할인된 가격 = %,d원\n",res);
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
