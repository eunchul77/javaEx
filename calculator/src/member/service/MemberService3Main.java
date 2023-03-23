package member.service;

import java.util.Scanner;

public class MemberService3Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		MemberService3 service = new MemberService3("홍길동", "1234"); // 내 진짜 id, pw // 생성자를 호출하는 이유
		while (true) {

			// 사용자루부터 id와 pw를 입력받았을 때
			// 직접 작성할때는 필요 없음
			System.out.println("id를 입력해주세요.");
			String id = scan.next();
			System.out.println("pw를 입력해주세요.");
			String pw = scan.next();

			// 객체를 생성하면 주소를 반환하기 때문에 같은 타입으로 반환
			// 생성자를 호출하려면 생성자가 가지고 있는 매개변수를 입력해야함
			// 생성자 호출 (매개변수 호출 아님!)

			// boolean res = service.login("홍길동", "1234") // 직접 입력했을 때
			boolean res = service.login(id, pw); // 로그인을 하기 위한 변수 선언 및 입력

			if (res) {
				System.out.println("환영합니다.");
				break;
			} else {
				System.out.println("id/pw가 일치하지 않습니다.");
			}

		}
		System.out.println("로그아웃을 하시려면 q를 입력해주세요.");
		String exit = scan.next();
		if("q".equals(exit)) {
			service.logout();
		
		} 
		
	}

}
