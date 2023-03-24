package com.kh.object;

import com.kh.object.practice.Product;

public class Application {

//	매개변수 생성자를 이용하여 3
//	개의 객체 생성 후 출력
//	setter 메소드를 이용하여 값
//	수정 후 출력
//	getter 메소드를 이용하여 부가
//	세 포함 상품 가격 출력
	
	public static void main(String[] args) {
		
		Product pro1 = new Product("ssgnote9","갤럭시노트9","경기도 수원",960000,10.0);
		Product pro2 = new Product("lgxnote5","LG스마트폰5","경기도 평택",780000,0.7);
		Product pro3 = new Product("ktsnote3","KT스마트폰3","서울시 강남",250000,0.3);
		
		
		System.out.println(pro1.information());		
		System.out.println(pro2.information());		
		System.out.println(pro3.information());		
		
		System.out.println("=================================================");
		
		pro1.setPrice(1200000);
		pro2.setPrice(1200000);
		pro3.setPrice(1200000);
		
		pro1.setTax(0.05);
		pro2.setTax(0.05);
		pro3.setTax(0.05);

		
		System.out.println(pro1.information());		
		System.out.println(pro2.information());		
		System.out.println(pro3.information());	
		
		System.out.println("=================================================");
		
		pro1.calc();
		pro2.calc();
		pro3.calc();
		
	}

}
