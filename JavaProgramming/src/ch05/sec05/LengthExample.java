package ch05.sec05;

public class LengthExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		int length = subject.length();
		System.out.println(length);
		System.out.println();
		
		
		String ssn = "9506241230123";
		int length2 = ssn.length();
		
		if (length2 == 13) {
			System.out.println("주민등록번호 자릿수가 맞습니다.");
		}
		else {
			System.out.println("주민등록번호 자릿수가 틀립니다.");
		}
		
	}

}
