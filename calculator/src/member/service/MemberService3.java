package member.service;

public class MemberService3 {

	public String id;
	public String pw;
	
	// 생성자
	public MemberService3(String id, String pw) { // 생성자가 없으면 아이디랑 비밀번호가 전부 null이 될거임
		this.id = id;
		this.pw = pw;
		
	}
	
	// 메서드
	/**
	 * 로그인 처리
	 * 필드에 등록된 id와 pw가 일치하면 true
	 * 일치하지 않으면 false를 반환
	 * @param id
	 * @param pw
	 * @return 로그인 성공 : true, 로그인 실패 : false
	 */
	public boolean login(String id, String pw) {
		// 필드 id : this.id
		// String은 == 비교할때 비교1.equals(비교2) 
		if(id!=null  // 아이디가 null이 아니고
				&& id.equals(this.id) 	// id가 필드의 id값과 동일하고 
				&& pw!=null 			// 패스워드가 null이 아니고
				&& pw.equals(this.pw)) {// pw가 필드의 pw값과 동일하면
			System.out.println("로그인 성공");
			return true;
		} else {
			System.out.println("로그인 실패");
			return false;
		}
		
	}
	
	public void logout() {
		// ★ 동일한 이름의 지역변수가 없으니까
		// ★ id는 필드를 의미한다.
		System.out.println(id + "님 로그아웃 되었습니다."); 
		
	}
	
	
}
