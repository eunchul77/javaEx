package arrayEx;

public class ArrayEx11 {

	public static void main(String[] args) {
		// 배열의 길이를 변경할수 없으므로 배열의 길이를 늘리거나 줄이기 위해서는 새로운 배열을 만들고 기존 배열을 복사한다.
		
		// int 타입 배열을 선언 
		// 배열의 값 목록 : {1,2,3}
		int[] oldArr = {1,2,3};
		int[] newArr = new int[5]; // == {0, 0, 0, 0, 0}
		
		for(int i=0;i<oldArr.length;i++) {
			//System.out.println(oldArr[i]);
			newArr[i] =  oldArr[i];
			System.out.println("oldArr" + i + " : " + oldArr[i]);
			}
		System.out.println("newArr 출력 ============");
		for(int i = 0;i<newArr.length;i++) {
			System.out.print(newArr[i]);
		}
	}

}
