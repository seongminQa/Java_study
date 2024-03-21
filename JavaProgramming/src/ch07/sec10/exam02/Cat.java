package ch07.sec10.exam02;

public class Cat extends Animal{
	// 필드
	public String kind;
	public String color;
	
	// 생성자
	public Cat(String kind, String color) {
		super(kind,color);
	}
	
	// 메소드

	@Override
	public void sound() {
		System.out.println("녜옹~");
	}
	
	public void catchMouse() {
		System.out.println("쥐를 잡습니다.");
	}
}
