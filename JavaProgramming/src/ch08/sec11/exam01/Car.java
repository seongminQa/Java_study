package ch08.sec11.exam01;

public class Car {
	// 필드 선언
	public Tire tire1 = new HankookTire();
	public Tire tire2 = new HankookTire();
	
	// 메소드 선언
	public void run() {
		tire1.roll();
		tire2.roll();
	}
}
