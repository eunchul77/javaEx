package bmiEx;

public class PrintfEx {

	public static void main(String[] args) {
		
		String name = "자바라";
		int age = 20;
		String id = "java";
		double height = 1.6;

		
		// 형식문자열
		// System.out.println("이름: " + name + " 나이 : " + age + " 아이디 : " + id); 
		// 이렇게 하면 너무 복잡함
		System.out.printf("이름: %s 나이: %-5d 아이디: %s 키: %f", name, age, id, height);
		
		// 지정한 형식문자열에 맞게 값 또는 변수를 대입 할수 있다.
		// %s : 문자, %d : 정수, %f : 실수
		System.out.printf("\n이름: %s 나이: %5d 아이디: %s 키: %f", "이은철", 27, id, height);
		// 자릿수를 정해줄 때 %5s : 5자리를 표시함 (왼쪽 공백)
		// 자릿수를 정해줄 때 %-5s : 5자리를 표시함 (오른쪽 공백)		
		// 자릿수를 정해줄 때 %05d : 5자리를 표시함 (공백대신 0 s는 제외(문자))		
		// %10.2f : 소수점 이상7자리, 소수 부분은 2자리 까지 출력
		System.out.printf("\n이름: %5s 나이: %05d 아이디: %s 키: %10.5f", "이은철", 27, id, height);
		
		// 천단위 구분기호 넣기, %표시하기
		int money= 10000000;
		System.out.printf("\n%,d %%", money);
		
		
	}
	
}
