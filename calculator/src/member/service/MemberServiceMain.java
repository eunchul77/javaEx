package member.service;

import java.util.Scanner;

public class MemberServiceMain {

	public static void main(String[] args) {
		System.out.println("========================");

//		MemberService member = new MemberService();
		MemberService2 member2 = new MemberService2("홍길동", null);
		Scanner scan = new Scanner(System.in);
		
		int i = 0;
		while (true) {
			System.out.println("아이디를 입력해주세요.");
			String id = scan.next();
			System.out.println("비밀번호를 입력해주세요.");
			String pw = scan.next();

			boolean res = member2.login(id, pw);

			if (res) {
				System.out.println(member2.id + "님 환영합니다.");
				break;
			} else {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다.");
				i ++;
				System.out.printf("남은 기회는 %d 번 입니다.\n", 5-i);
				System.out.println("===========================");
				if(i>=5){
					System.out.println("5회이상 틀렸습니다. 로그인을 종료합니다");
					System.exit(0);
				}
			}
		}
		member2.logout("");

//		boolean res = member.login("hong", "12345");
//		
//		if(res) {
//			System.out.println("홍길동님 환영합니다.");
//		member.logout("홍길동");
//		} else {
//			System.out.println("아이디와 비밀번호가 일치하지 않습니다.");
//			}
//		
//		
//		}

	}
}
