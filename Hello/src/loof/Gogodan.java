package loof;

public class Gogodan {

	public static void main(String[] args) {
		System.out.println("구구단");

		int i = 0;
		int a = 1;

		while (i < 10) {

			i = i + 1;
			System.out.printf("%2d *%2d = %-2d  ", a, i, a * i);

			if (i == 9) {
				System.out.println("");
				a = a + 1;
				i = 0;
			}
			if (a == 10) {
				break;
			}
		}
	}
}


