package member;

public class MemberExample {

	public static void main(String[] args) {
		
		Member member =new Member();
		member.name = "최하얀";
		member.ageUp();
		
		System.out.println(member.name);
		System.out.println(member.age);

		member.age += 10;
		System.out.println(member.age);
		
		
	}

}
