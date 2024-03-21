package ch06.checkproblem;

public class ShopService {

	// 18번 // 싱글톤
	private static ShopService test = new ShopService();
	
	// 생성자 선언
	private ShopService() {
	}
	
	// 메소드 선언
	public static ShopService getInstance() {
		return test;
	}
	
}
