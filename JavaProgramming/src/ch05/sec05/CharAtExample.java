package ch05.sec05;

public class CharAtExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(1);
		System.out.println(charValue);
		
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		
		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
		
	}

}
