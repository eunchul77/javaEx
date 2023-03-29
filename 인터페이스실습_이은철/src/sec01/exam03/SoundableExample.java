package sec01.exam03;

public class SoundableExample implements Soundable {

	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

	}

	private static void printSound(Soundable so) {
		System.out.println(so.sound());
	}

	@Override
	public String sound() {
		// TODO Auto-generated method stub
		return null;
	}

}
