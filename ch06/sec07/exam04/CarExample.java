package ch06.sec07.exam04;

public class CarExample {

	public static void main(String[] args) {

		Car Car1 = new Car();
		
		Car Car2 = new Car("소나타");
		
		Car Car3 = new Car("그랜저", "흰색");
		
		Car Car4 = new Car("싼타페", "검은색", 230);
		
		System.out.println("Car1.company : " + Car1.company);
		System.out.println();
		System.out.println("Car2.model : " + Car2.model);
		System.out.println();
		System.out.println("Car3.model : " + Car3.model);
		System.out.println("Car3.color : " + Car3.color);
		System.out.println();
		System.out.println("Car4.model : " + Car4.model);
		System.out.println("Car4.color : " + Car4.color);
		System.out.println("Car4.maxSpeed : " + Car4.maxSpeed);
		
	}

}
