package ifelse;

public class Rotto1 {

	public static void main(String[] args) {

//		int count = 0;
		int cube = (int)(Math.random()*6) + 1;
		
		switch (cube) {
		case 1 :
			System.out.println("1번이 나왔습니다."); break;
		case 2 :
			System.out.println("2번이 나왔습니다."); break;
			
		case 3 :
			System.out.println("3번이 나왔습니다."); break;
			
		case 4 :
			System.out.println("4번이 나왔습니다."); break;
		
		case 5 :
			System.out.println("5번이 나왔습니다.");
			
		case 6 :
			System.out.println("6번이 나왔습니다."); break;

			
		default:
			System.out.println("======종료=====");break;

		}
		
		
		
		
		
		
//		while(true) {
//			int rotto = (int)(Math.random()*45) + 1;
//			
//			System.out.printf("이번주 로또 번호는 %d 입니다.\n", rotto);
//			
//		count = count +1;
//				
//			if(count == 6) {
//					break;
//			}
//		
//		}
	}

}
