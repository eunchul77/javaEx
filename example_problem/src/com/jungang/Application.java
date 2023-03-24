package com.jungang;

import com.jungang.practice.Product;

public class Application {

	public static void main(String[] args) {

		Product pro1 = new Product("ssgnote9", "갤럭시노트9", "경기도 수원", 960000, 10.0);
		Product pro2 = new Product("lgxnote5", "LG스마트폰5", "경기도 평택", 780000, 0.7);
		Product pro3 = new Product("ktsnote3", "KT스마트폰3", "서울시 강남", 250000, 0.3);
		
		System.out.println(pro1.imformation());
		System.out.println(pro2.imformation());
		System.out.println(pro3.imformation());
	
		System.out.println("===========================================");
		
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);
		pro3.setPrice(1200000);
		
		pro1.setTax(0.05);
		pro2.setTax(0.05);
		pro3.setTax(0.05);
		
		System.out.println(pro1.imformation());
		System.out.println(pro2.imformation());
		System.out.println(pro3.imformation());
		
		System.out.println("===========================================");
		pro1.result();
		pro2.result();
		pro3.result();
		
		
	}

}
