package test.jungang;

public class Test3Main {

	public static void main(String[] args) {
		
		Test3[] testArr = new Test3[4];
		
		testArr[0] = new Test3("홍길동","남자", 15, 49);
		testArr[1] = new Test3("홍길순","여자", 17);
		testArr[2] = new Test3("홍길자","여자", 45, 76);
		testArr[3] = new Test3("홍길자","여자", 95, 50);
		
		for(Test3 tArr : testArr) {
			System.out.println(tArr.name);
			System.out.println(tArr.gender);
			System.out.println(tArr.age);
			System.out.println(tArr.weigth);
		}
		
		
		
	}

}
