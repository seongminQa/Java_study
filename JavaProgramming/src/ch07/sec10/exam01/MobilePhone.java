package ch07.sec10.exam01;

public abstract class MobilePhone {
	
	// 필드 선언
	public String owner;
	
	// 생성자
	public MobilePhone(String owner) {
		this.owner = owner;
	}
	
	
	// 메소드
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

	// 추상 메소드 --> 추상 클래스만 추상 메소드를 가질 수 있다.
	public abstract void internetSearch();

}
