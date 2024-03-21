package ch06.sec15;

public class Singleton {
	
	// 필드 선언
	// private 접근 권한을 갖는 정적 필드 선언과 초기화
	private static Singleton instance = new Singleton();
	
	// 생성자 선언
	// private는 자기 자신의 클래스에선 사용 가능하다.
	private Singleton() {
		
	}
	
	// 메소드 선언
	public static Singleton getInstance() {
		return instance;
	}
	
	
}
