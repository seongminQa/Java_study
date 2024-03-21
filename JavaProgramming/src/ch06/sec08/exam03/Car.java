package ch06.sec08.exam03;

public class Car {

	// 필드 선언
	int gas;

	
	// 생성자 선언

	
	// 메소드 선언
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas--;
			} else {
				System.out.println("멈춥니다.(gas잔량: " + gas + ")");
//				return
				break;
			}
		}
		System.out.println("run() 메소드를 종료합니다.");
	}
	
}
