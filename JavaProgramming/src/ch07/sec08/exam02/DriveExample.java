package ch07.sec08.exam02;

public class DriveExample {

	public static void main(String[] args) {

		Driver driver = new Driver();
		
		Vehicle vehicle = new Vehicle();
		driver.drive(vehicle);
		
		Bus bus = new Bus();
		driver.drive(bus);
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		
		//
		driver.drive(new Bus());	// 자동 타입변환
		driver.drive(new Taxi());	// 자동 타입변환
	}

}
