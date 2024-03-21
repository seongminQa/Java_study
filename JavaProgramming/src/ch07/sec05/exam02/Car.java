package ch07.sec05.exam02;

public class Car {
	// field 선언
	public int speed;
	
	// Constructor 선언
	
	// Method 선언
	public void speedUp() {
		speed += 1;
	}
	
	// 자식 클래스에서 final이 붙은 메소드는 재정의할 수 없음
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
	
}
