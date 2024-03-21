package ch07.sec10.exam01;

public class AndroidPhone extends MobilePhone{
	
	// 필드 선언
//	public String owner;
	
	// 생성자
	public AndroidPhone(String owner) {
		super(owner);
	}
	
	
	// 메소드
	/*public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}*/
	
	@Override
	public void internetSearch() {
		System.out.println("크롬 브라우저로 인터넷을 검색합니다.");
	}
	
}
