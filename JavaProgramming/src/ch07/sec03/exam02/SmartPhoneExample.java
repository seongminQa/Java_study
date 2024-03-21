package ch07.sec03.exam02;

public class SmartPhoneExample {

	public static void main(String[] args) {

		// 객체 생성
		SmartPhone p1 = new SmartPhone("갤럭시", "퍼플");
		
		// 상속받은 필드 읽어보기
		System.out.println("모델: " + p1.model);
		System.out.println("색상: " + p1.color);

	}

}
