package arrayEx;


public class ArrayEx05 {

	public static void main(String[] args) {
		// 스트링 타입의 배열 5칸을 만들고 이름을 입력해봅시다.
		// 첫번째칸에 이름 입력하기
		String[] name = new String[5];
		name[0] = "홍길동";
		
		System.out.println("name 배열의 메모리 주소 : ");
		System.out.println(name);
		
		// 자바에서 참조형 변수의 메모리 주소를 표시하는 방법
		System.out.println("name객체의 hashCode : " + name.hashCode());
		
		// 16진수로 표시
		System.out.println("16진수로 변환 : "  + Integer.toHexString(name.hashCode())); // 16진수로 표시
		System.out.printf("%x", name.hashCode());
		
		
	}

}
