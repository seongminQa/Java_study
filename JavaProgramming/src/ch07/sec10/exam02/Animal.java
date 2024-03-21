package ch07.sec10.exam02;

public abstract class Animal {
	// 필드
	public String kind;
	public String color;

	// 생성자
	public Animal(String kind, String color) {
		this.kind = kind;
		this.color = color;
	}

	// 메소드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();
}
