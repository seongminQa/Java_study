package ch06.sec09;

public class Car {

	// 필드 선언
	static String company = "현대자동차"; // 모든 객체가 공유하는 정의는 static으로 하는 것이 좋다.
										// 객체마다 생성하는 것은 비효율적.
	String model;
	int speed;
	
	// 생성자 선언
	Car(String model){
		this.model = model;
	}
	
	// 메소드 선언
	
	static void info() {
		System.out.println(company + "가 설계한 자동차");
		//this.model = "그랜저"; // 컴파일 오류 --> this는 객체 자신을 의미.
							 // static으로 선언해주었기 때문에 객체를 사용해야 쓸 수 있는 this를 쓰면 안된다.
		
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		setSpeed(100);
		System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
		// 사실 this를 사용하지 않아도 기능하는데,
		// this를 사용한 이유는 model과 speed가 인스턴스 필드라는 것을 강조하기 위해 사용한 것이다!**
	}
	
	static void run2() {
//		setSpeed(100); // 정적 메소드에 객체를 통해 사용가능한 setSpeed() 메소드는 사용할 수 없다.
		info(); // info() 메소드는 그 안에 인스턴스 필드를 사용하지 않았기 때문에 사용 가능하다!!**
	}
	
}
