package ch08.sec11.exam03;

public class InstanceofExample {

	public static void main(String[] args) {
		
		// 구현 객체 만들어보기
		Taxi taxi = new Taxi();
		Bus bus = new Bus();
		
		ride(taxi);
		System.out.println();
		ride(bus);
		
		
	}
	
	
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		
		vehicle.run();
	}

}
