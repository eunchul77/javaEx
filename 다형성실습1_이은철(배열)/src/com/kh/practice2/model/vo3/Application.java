package com.kh.practice2.model.vo3;

import java.util.concurrent.atomic.AtomicIntegerArray;

import com.kh.practice2.model.vo3.Animal; // 생성하면 뭐가 좋징..?오류가 안뜸..(?)
import com.kh.practice2.model.vo3.Cat; // 생성하면 뭐가 좋징..?오류가 안뜸..(?)
import com.kh.practice2.model.vo3.Dog; // 생성하면 뭐가 좋징..?오류가 안뜸..(?)

public class Application {

	public static void main(String[] args) {
		Animal[] aniArry = new Animal[5];
		
		Dog dog = new Dog("흰둥이", "강아지", 25);
		Cat cat = new Cat("냐옹이", "고양이", "서울", "검정");
		
		// 배열에 각 방에 고양이 또는 멍멍이를 입력
		for(int i = 0; i<aniArry.length; i++) { // 0~4까지 5번 반복
			int ran = (int)(Math.random()*2); // 0~1 얻을 수 있음.(1~2를 구하고 싶으면 *2+1)
			if(ran == 1) {
				aniArry[i] = dog;
			} else {
				aniArry[i] = cat;
			}
		}
		
		for(Animal ani :aniArry) {
			// 자식 객체에서 재정의(오버라이딩) 되어진 메서드가 호출
			ani.speak();
		}
	}
}
