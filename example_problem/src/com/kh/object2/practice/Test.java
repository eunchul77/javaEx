package com.kh.object2.practice;

class Test {
	Test() {
	}

	static void m1 () {
		System.out.println("호출");
	}

	void m2 () {
		System.out.println("호출");
	}
	
	public static void main(String[] args) {
		Test.m1(); // 호출o
//		Test.m2(); // 호출x
		
		Test a = new Test();
		a.m1(); // 호출x
		a.m2(); // 호출o
		
	}
	
}

