package test.jungang;

public class Test2Main {

	public static void main(String[] args) {

		Test2 testmain = new Test2(null, 0);
		
		Test2[] testArr = new Test2[5];
		
		testArr[0] = new Test2("이은철1","여자", 10);
		testArr[1] = new Test2("이은철2","남자", 20);
		testArr[2] = new Test2("이은철3","여자", 30);
		testArr[3] = new Test2("이은철4","남자", 40);
		testArr[4] = new Test2("이은철5", 50);
		
		for(Test2 tArr : testArr) {
			System.out.println("---------");
			System.out.println(tArr.name);
			System.out.println(tArr.gender);
			System.out.println(tArr.age);
		}
		
		
	}

}
