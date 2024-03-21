package ch07.sec03.exam02;

public class SmartPhone extends Phone{

	// 필드 선언
	public boolean wifi;
	
	// 생성자 선언
	public SmartPhone(String model, String color) {
		// super(); // 상속을 받은 클래스 생성자 내부에 우리 눈에 보이지 않은 super();가 실행되기 때문에
		// 부모 생성자가 먼저 실행되는 것이다.
		super("그랜져", "검정");
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone 생성자 실행 : " + model + " " + color);
	}

	
}
