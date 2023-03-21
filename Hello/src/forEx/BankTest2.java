package forEx;

import java.util.Scanner;

public class BankTest2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int money = 0;
		int total = 0;
		
		late : // 라벨(이름)을 붙여준 뒤 break late; 을 하면 이름이 있는쪽으로 와서 끝남
		while (true) {
		System.out.println("--------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		System.out.println("--------------------------------");
		// switch(변수){}
		// case 변수의 값 :
		// 1. case문 완성
		// 2. 반복해서 실행하기
		
		int input = scan.nextInt(); // 사용자의 입력을 숫자로 반환
			
			switch (input) {
			case 1:
				// 변수의 값이 1이면 실행 -> 코드작성
				// break문이 없으면 다음 case를 계속해서 실행 합니다.
				System.out.println("선택> 1");
				System.out.println("얼마를 예금 하시겠습니까?");
				money = scan.nextInt();
				total += money;
				System.out.println("예금액>" + money);
				System.out.println("총 잔액>" + total);
				break; // break문이 없으면 다음 case를 계속해서 실행 합니다.
			case 2:
				System.out.println("선택> 2");
				System.out.println("얼마를 출금 하시겠습니까?");
				money = scan.nextInt();
				if (money > total) {
					System.out.println("잔액이 부족합니다.");
				} else if (money <= total) {
					System.out.println("출금액>" + money);
					total -= money;
					System.out.println("남은 잔액>" + total);
				}
				break;
			case 3:
				System.out.println("선택> 3");
				System.out.println("잔고>" + total);

				break;
			case 4:
				System.out.println("선택> 4");
				System.out.println("프로그램 종료");

				break late; // while 위에 late : 을 선언했기 때문에 가능

			default:
				break;
			}
		}
		scan.close(); // 자원을 반납 // Scanner를 선언했으면 선언한 메소드 안에 .close 해야함
	}

}
