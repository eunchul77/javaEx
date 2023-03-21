package arrayEx;

public class ArrayEx10 {

	public static void main(String[] args) {
		
		String[] names = new String[3]; // 참조타입이기 때문에 주소를 가지고있음
		names[0] = new String("Java");
		names[1] = new String("Java");
		// new String을 안하고 "Java"만 할경우 0==1 // new String을 하면 0 != 1 (새롭게 주소를 만들어내기 때문에)
		names[2] = "C#";

		// 참조타입에서 == : 참조타입의 변수가 가지고 있는 주소를 비교
		// .equals : 문자열 자체를 비교
		if(names[0].equals(names[1])) { // 	if(names[0]==(names[1])) // 출력값 != // new String으로 새로운 주소를 만들어내서
			System.out.println("0번방 == 1번방");
		} else {
			System.out.println("0번방 != 1번방");
		}
	}

}
