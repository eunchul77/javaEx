package com.kh.practice2.model.vo2;

public class Application {

	public static void main(String[] args) {
		
		Animal[] anArry = new Animal[5];
		
		Dog dog = new Dog("흰둥이", "강아지", 7);
		Cat cat = new Cat("길냥이", "고양이", "디엠씨", "검정색");
		
		dog.speak();
		cat.speak();
		
		System.out.println("5번 출력중==================================");
		
		for(int i=0; i<anArry.length; i++){
			int ra = (int)(Math.random()*2);
				if(ra==1) {
					anArry[i] = dog;
				} else if(ra==0) {
					anArry[i] = cat;
				}
			
				
		}
		
		for(int i=0; i<anArry.length; i++) {
			anArry[i].speak();
		}
		
	}
	
}
