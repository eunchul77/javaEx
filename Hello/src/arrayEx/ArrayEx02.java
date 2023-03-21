package arrayEx;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 배열을 생성
		// 반복문을 이용해서 배열에 입력된 값을 출력
		
		String[] names = {"이은철", "이은동", "이은금", "이은은", "이은쇠"};

		// 반복문을 이용해서 배열에 입력된 값을 출력
		// 기본타입은 변수. 해도 참조할수 있는게 없지만, 참조타입은 변수. 하면 참조할수있는 메소드가 나온다.
		
		for(int i=0; i<names.length; i++) {
			// 배열의 값에 접근 : 변수이름[방번호]
			System.out.println(names[i]);
			
		}
		
	}

}
