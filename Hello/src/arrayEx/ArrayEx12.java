package arrayEx;

public class ArrayEx12 {

	public static void main(String[] args) {
		// 값을 넣을때는 new 타입 안넣음(?)
		String[] oldStrArr = {"java", "array","copy"};
		String[] newStrArr = new String[5];
		
		// System.arraycopy(원본배열, 복사시작 index, 새로운 배열, 새로운 배열에 복사를 시작할 index, 복사할 개수)
		// java 기본 API에서 제공해주는 메서드를 활용해서 배열을 복사
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);

		for(int i=0; i<newStrArr.length;i++) {
			System.out.println(newStrArr[i]);
		}
		
		//향상된 for문을 이용하는 방법
		// for(타입 변수명 : 배열의이름)
		// 배열의 요소를 모두 순회 합니다. 0 ~ 끝까지(0<배열.length)
		System.out.println("================");
		for(String str :oldStrArr) {
			System.out.println(str);
		}
		
	}

}
