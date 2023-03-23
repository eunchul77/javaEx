package korean.object;

public class KoreanMain {

	public static void main(String[] args) {
		
		Korean mykorean = new Korean();
		mykorean.name = "전지현";
		mykorean.ssn = "222222-2222222";
		
		System.out.println("Korean ===================");
		System.out.println(mykorean.name);
		System.out.println(mykorean.ssn);
		System.out.println(mykorean.nation);
		
		// 객체 초기화
		Korean hong = new Korean("홍길동","123456-1234567");
		System.out.println("hong ===================");
		System.out.println(hong.name);
		System.out.println(hong.ssn);
		System.out.println(hong.nation);
		
		Korean lee = new Korean("이하늬","111111-222222");
		System.out.println("lee ===================");
		System.out.println(lee.name);
		System.out.println(lee.ssn);
		System.out.println(lee.nation);
		
		
		
	}

}
