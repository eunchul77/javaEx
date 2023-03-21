package forEx;

import java.util.Scanner;

public class Ex04_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int money = 0;
		outter: // 라벨(이름)을 붙여줍니다.
			while (true) {

			System.out.println("================================");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("================================");
			System.out.println("선택>");
			// switch(변수){}
			// case 변수의 값 :
			// 1. case문 완성
			// 2. 반복해서 실행하기

			int input = scan.nextInt(); // 사용자의 입력을 숫자로 반환
			switch (input) {
			case 1:
				// 변수의 값이 1이면 실행 -> 코드작성
				// break문이 없으면 다음 case를 계속해서 실행 합니다.
				System.out.println("예금액>");
				money += scan.nextInt();
				System.out.println("사용자입력값 : " + money);
				break; // break문이 없으면 다음 case를 계속해서 실행 합니다.
			case 2:
				System.out.println("출금액>");
				int num = scan.nextInt();
				if (money < num) {
					System.out.println("금액이 부족합니다.");
				} else {
					money -= num; // money = money - num
				}
				break;
			case 3:
				System.out.println("잔고 : " + money);
				break;

			case 4:
				//System.exit(0);
				break outter;
			default :
				break;
			
			}
		}
		
		scan.close(); // 자원을 반납
		
		System.out.println("money : " + money);
		System.out.println("프로그램이 종료되었습니다.");
	}

}
