package ch07.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		
		//MobilePhone m1 = new MobilePhone("김성민");	// 추상 클래스는 객체를 생성하지 못한다!
		AndroidPhone a1 = new AndroidPhone("김성민");
		
		a1.turnOn();
		a1.internetSearch();
		a1.turnOff();
		
		System.out.println();
		
		IPhone a2 = new IPhone("김승민");
		
		a2.turnOn();
		a2.internetSearch();
		a2.turnOff();
		
		System.out.println();
		
		MobilePhone mp;
		
		mp = new AndroidPhone("감자바");
		mp.turnOn();
		mp.internetSearch();
		mp.turnOff();
		
		System.out.println();
		
		mp = new IPhone("남자바");
		mp.turnOn();
		mp.internetSearch();
		mp.turnOff();
		
		
	}

}
