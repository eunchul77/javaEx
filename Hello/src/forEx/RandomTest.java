package forEx;

public class RandomTest {

	public static void main(String[] args) {
		//확인필요, 갑자기 왜 반올림이 되지
		
		while(true) {
		int i = (int)(Math.random()*6 + 1); // 1~6까지의 랜덤 수 추출
		int j = (int)(Math.random()*6 + 1); // 1~6까지의 랜덤 수 추출
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		
		// i, j 의 합이 5이면 (i,j) 출력후 종료
		// 아니면 계속 주사위를 굴립니다.
		
		if(i+j==5) {
			System.out.println("i+j의 합계 : " + (i+j));
			break;
		} 
	}

}
}