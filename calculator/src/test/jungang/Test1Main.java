package test.jungang;

public class Test1Main {

	public static void main(String[] args) {

		Test1 test = new Test1(null,null, 0);
		
		Test1[] testArr = new Test1[5];

		testArr[0] = new Test1("이은철1", "남자", 150);
		testArr[1] = new Test1("이은철2", "남자", 160);
		testArr[2] = new Test1("이은철3", "여자", 170);
		testArr[3] = new Test1("이은철4", "남자", 180);
		testArr[4] = new Test1("이은철5", "여자", 190);
		
		
		for(Test1 tArr : testArr) {
			System.out.println("-----------");
			System.out.print(tArr.name);
			System.out.print(tArr.gender);
			System.out.println(tArr.heigth);
		}
	}

}
