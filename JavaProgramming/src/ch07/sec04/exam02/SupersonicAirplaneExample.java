package ch07.sec04.exam02;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {

		SupersonicAirplane sa = new SupersonicAirplane();
		
		sa.takeoff();
		sa.fly();
//		sa.flyMode = FlyMode.SUPERSONIC;
		sa.flyMode = SupersonicAirplane.FlyMode.SUPERSONIC;
		sa.fly();
//		sa.flyMode = FlyMode.NORMAL;
		sa.flyMode = SupersonicAirplane.FlyMode.SUPERSONIC;
		sa.fly();
		sa.land();
		
	}

}
