package ch06.sec15;

public class SingletonExample {

	public static void main(String[] args) {

		// 다른 클래스에서 객체를 만들지 못함
//		Singleton st = new Singleton();
		
		Singleton st1 = Singleton.getInstance();
		Singleton st2 = Singleton.getInstance();
		
		if(st1 == st2) {
			System.out.println("같은 Singleton 객체입니다.");
		} else {
			System.out.println("다른 Singleton 객체입니다.");
		}
		
	}

}
