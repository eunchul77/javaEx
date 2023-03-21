package forEx;

public class GugudanTest2 {

	public static void main(String[] args) {

		for (int b = 1; b < 10; b++) {
			System.out.printf("%d단\n",b);
			for (int a = 1; a < 10; a++) {
				System.out.printf("%d*%d=%d\n", b, a, b * a);
			}
		}
	}

}
