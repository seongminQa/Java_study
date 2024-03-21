package ch06.sec15;

public class Account {
	
	// 필드 선언
//	public static int balance;  // 잔고가 객체마다 다 다르기 때문에 static으로 하면 안된다!
//	public int balance;
	private int balance;
	// 2)
	private static Account instance = new Account();
	
	// 생성자 선언
	// 1) 외부(다른 클래스)에서 이 생성자를 사용하지 못하게 막아놓음.
	private Account() {}
	
	
	// 메소드 선언
	public void input(int amount) {
		balance += amount;
	}
	
	public void output(int amount) {
		balance -= amount;
	}
	
	// 3)
	public static Account getInstance() {
		return instance;
	}
	
	// 4)
	public int getBalance() {
		return balance;
	}
	
}
