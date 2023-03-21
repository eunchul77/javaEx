package arrayEx;

// 접근제어자 class 클래스명 {}
public class ArrayEx06 {

	// 접근제어자(public) 반환타입(void) 메서드명(main)(매개변수){}
	// void : 반환 타입이 없다는 의미(int, String)
	// 매개변수 : (타입 변수명) // 필수x
	// 매개변수가 있다면 타입을 명시 해줘야 한다.
	public static void main(String[] args) { 
		// String[] args의 값을 알아내는법 - > run - run configurations -> Arguments
		
		// 1 : 로컬, 2 : 텍스트, 3 : 운영
		int mode = Integer.parseInt(args[0]);
		if(mode==1) {
			System.out.println("로컬환경 입니다.");
			// 로컬 DB 접속
		} else if(mode==2) {
			System.out.println("텍스트환경 입니다.");
			// 텍스트 DB 접속
		} else if(mode==3) {
			System.out.println("운영환경 입니다.");
		}
		
		
//		for(int i =0; i<args.length;i++) {
//			System.out.println(args[i]);
//		}
		
		//System.out.println(args[0]);
		
	}

}
