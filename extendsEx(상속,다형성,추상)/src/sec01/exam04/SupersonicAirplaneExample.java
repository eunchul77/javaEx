package sec01.exam04;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		SupersonicAirplane superSonic = new SupersonicAirplane(SupersonicAirplane.NORMAL);
		superSonic.takeOff();
		superSonic.fly();
		
		superSonic.flyMode = SupersonicAirplane.SUPERSONIC;
		superSonic.fly();
		
		superSonic.flyMode = SupersonicAirplane.NORMAL;
		superSonic.fly();
		
		// 착륙
		superSonic.land();
	}

	public SupersonicAirplaneExample() {
		
	}
	
	
}
