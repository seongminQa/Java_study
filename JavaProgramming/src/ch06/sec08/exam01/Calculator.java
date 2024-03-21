package ch06.sec08.exam01;

public class Calculator {
	
	// 필드 선언
	
	// 생성자 선언
	
	//메소드 선언
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divid(int x, int y) {
		double result = (double) x / y;
		return result;
	}
	
	int minus(int x, int y) {
		int result = x - y;
		return result;
	}
	
	
	
}
