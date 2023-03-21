package forEx;

import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int money = 0;
		out: 
		while(true) {
		System.out.println("--------------------------------");
		System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
		System.out.println("--------------------------------");

		
		int input = scan.nextInt();
		switch (input) {
		case 1: 
			System.out.println("선택 > 1");
			System.out.println("예금액>");
			int plus = scan.nextInt();
			money += plus;
			System.out.println("예금액>" + plus);
			break;
			
		case 2:
			System.out.println("선택> 2");
			System.out.println("출금액> ");
			int num = scan.nextInt();
			if(money<num) {
				System.out.println("출금 금액이 모자랍니다.");
			} else if(money>=num) {
				money -= num; 
			System.out.println("출금액> " + num);
			}
			break;
			
		case 3: 
			System.out.println("선택> 3");
			System.out.println("잔고>" + money);
			
			break;
		case 4:
			System.out.println("선택> 4");
			break out;

		default:
			break;
			}
		}
		scan.close();
		
		
		System.out.println("프로그램을 종료합니다.");
		
		
	}

}
