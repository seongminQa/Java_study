package ch07.sec10.exam02;

public class Dog extends Animal{
	// 필드

	// 생성자
	public Dog(String kind, String color) {
		super(kind,color);
	}

	// 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	@Override
	public void sound() {
		System.out.println("월월!");
	}

	public void keepHouse() {
		System.out.println("집을 지킵니다.");
	}
}
