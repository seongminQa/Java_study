package subject.marchnine.twenty.second;

public class Account {

	// 필드 선언
	// public final String account; // 계좌번호는 각 객체마다 가지는 고유한 값..
	// final로 선언해야하지 않을까?
	// private로 하면 계좌번호 조회가 안됨, 확인?

	public String account; // 계좌번호
	public String name; // 계좌주
	public int balance = 0; // 잔고

	// 생성자 선언
	public Account() {}


	// 메소드 

	// 예금 메소드
	public void setDeposit(int balance) {
		if(balance < 0) {
			System.out.println("예금액은 음수가 될 수 없습니다!");
		}
		else {
			this.balance += balance;
		}
	}
	
	// 출금 메소드
	public void setWithdraw(int balance) {
		if(balance < 0) {
			System.out.println("출금액은 음수가 될 수 없습니다!");
		}
		else if(this.balance - balance < 0){
			System.out.println("출금하려는 금액이 계좌의 잔고를 초과합니다!");
		}
		else {
			this.balance -= balance;
		}
	}
	
	public int getBalance() {
		return balance;
	}

}
