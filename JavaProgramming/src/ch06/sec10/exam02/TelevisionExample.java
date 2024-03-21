package ch06.sec10.exam02;

public class TelevisionExample {

	// 필드 선언
	// 정적 필드
	static String name = "홍길동";
	
	// 인스턴스 필드
	int speed = 60;
	
	
	// 생성자 선언
	
	
	
	// main 메소드
	public static void main(String[] args) {

		Television t1 = new Television();
		System.out.println(t1.info);
		System.out.println(name);
		
		TelevisionExample t2 = new TelevisionExample();
		System.out.println(t2.speed);
	}

}
