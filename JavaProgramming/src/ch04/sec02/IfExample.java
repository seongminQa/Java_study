package ch04.sec02;

public class IfExample {

	public static void main(String[] args) {

		int score = 90;
		
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
		if (score < 90) 
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");	// 중괄호를 해주지 않았기 때문에, if문이 true일 경우 바로 밑의 실행문 하나만 실행하게 된다.
		
		
	}

}
