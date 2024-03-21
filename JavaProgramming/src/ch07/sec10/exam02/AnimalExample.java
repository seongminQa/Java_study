package ch07.sec10.exam02;

public class AnimalExample {

	public static void main(String[] args) {
		
		/*Cat cat = new Cat("한국고양이", "노랑");
		cat.breathe();
		cat.sound();
		cat.catchMouse();
		
		System.out.println();
		
		Dog dog = new Dog("진돗개", "흰색");
		dog.breathe();
		dog.sound();
		dog.keepHouse();*/
		
		// 이제부터 추상 클래스를 활용하여 연습해보기
		/*Animal cat2;
		
		cat2 = new Cat("페르시안", "남색");
		cat2.breathe();
		cat2.sound();
		//cat2.catchMouse();
		
		System.out.println();
		
		Animal dog2;
		dog2 = new Dog("요쿠셔테리어", "검갈색");
		dog2.breathe();
		dog2.sound();
		//dog2.keepHouse();
		*/
		
		dailyLife(new Cat("페리시안","흰검"));
		System.out.println();
		dailyLife(new Dog("말티즈","흰색"));
		
		
	}
	
	public static void dailyLife(Animal animal) {
		animal.breathe();
		animal.sound();
		
		if(animal instanceof Dog dog) {
			dog.keepHouse();
		} else if (animal instanceof Cat cat) {
			cat.catchMouse();
		}
		
	}

}
