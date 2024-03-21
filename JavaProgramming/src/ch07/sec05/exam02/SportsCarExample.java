package ch07.sec05.exam02;

public class SportsCarExample {

	public static void main(String[] args) {

		SportsCar car = new SportsCar();
		
		car.speedUp();
		System.out.println(car.speed);
		car.stop();
		System.out.println(car.speed);
		
	}

}
