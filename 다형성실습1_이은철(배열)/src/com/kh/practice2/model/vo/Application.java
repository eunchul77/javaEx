package com.kh.practice2.model.vo;

public class Application {

	public static void main(String[] args) {
		Animal cat = new Cat("냐옹이","고양이", "서울", "검정");
		Animal dog = new Dog("멍멍이", "강아지", 20);
		
		dog.speak();
		cat.speak();
		
		Animal[] Arry = new Animal[5];
	
		System.out.println("5번 랜덤 출력중==================================================");
//(int)(Math.random()*2)
		for(int i=0; i < Arry.length ; i++) {
			int j = (int)(Math.random()*2);
			if(j==0) {
				Arry[i] = dog;
			} else {
				Arry[i] = cat;
			}
			
		}
		
//		
		for(int i=0; i<Arry.length; i++) {
			Arry[i].speak();
		}
		
		}
		
		
		
	}
