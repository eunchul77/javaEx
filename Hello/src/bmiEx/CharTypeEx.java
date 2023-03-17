package bmiEx;

public class CharTypeEx {

	public static void main(String[] args) {
		
		// 홑따옴표 안에 하나의 문자를 저장
		char var1 = 'A';
		char var2 = '오';
		
		char var3 = 65;
		char var4 = 0x0041;
		
		int var0 = 'A';
		
		// 문자열을 저장
		String var5 = "";
		//정수의 리터럴이 입력되면 int로 받아 들이기 떄문에 long 타입의 경우 숫자뒤에 l(L) 또는 L을 입력 합니다.
		long var6 = 123456789123456789l;
		
		// 실수타입
		// 실수의 리터럴이 입력되면 double로 받아 들이기 떄문에 float 타입의 경우 숫자뒤에 f또는 F을 입력 합니다.
		
		float var7 = 0.123456789123456789f;
		double var8 = 0.123456789123456789;
		float var9 = 5e-3f;  // 10의 -3승                                                               
		
		boolean var10 = true;
		boolean var11 = false;
		// 참 거짓을 판단
		// 문자열과는 다름
		if(true) {
			System.out.println(true);
		}
		if(false) {
			// 참일때
			System.out.println("true");
		} else {
			// 거짓일때
			System.out.println("false");
		}
		
		System.out.println("실수 출력=====================");
		System.out.println(var7);
		System.out.println(var8);
		System.out.println(var9);
		System.out.println("실수 출력종료=====================");
		
		// 타입 변환 : 괄호 안에 타입을 넣어줍니다!
		System.out.println("char 타입 실습 ===============");
		System.out.println((int)var1); // 명시적 형변환
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var0);
		System.out.println(var6);
		System.out.println("\"");
		System.out.println("나는\n오늘\n\'순대국\'이\n먹고싶다\\");
		
		
	}

}
