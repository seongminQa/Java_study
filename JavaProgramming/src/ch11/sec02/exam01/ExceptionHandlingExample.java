package ch11.sec02.exam01;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		try {
			String name = null;
			int length = name.length();
			System.out.println("문자열의 길이: " + length);
		} catch(NullPointerException e) {
			System.out.println(e + "에러가 발생하여 \n프로그램 종료");			
		} finally {
			System.out.println("try-catch-finally구문 연습이었습니다.");
		}
		System.out.println();
		
		try {
			String name = "홍길동";
			int length = name.length();
			System.out.println("문자열의 길이: " + length);
		} catch(NullPointerException e) {
			System.out.println(e + "에러가 발생하여 \n프로그램 종료");			
		} finally {
			System.out.println("try-catch-finally구문 연습이었습니다.");
		}
	}

}
