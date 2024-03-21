package ch11.sec02.exam02;

public class ExceptionHandlingExample2 {
	
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자 수: " + result);	
		} catch(NullPointerException e) {
			System.out.println("문자열이 없습니다.");
			System.out.println(e.getMessage());
			System.out.println("-------------");
			System.out.println(e.toString());
			System.out.println("-------------");
			e.printStackTrace();
		} finally {
			System.out.println("예외 처리 구문이 마무리되었습니다.");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		printLength("This is java");
		printLength(null);
		
		System.out.println("프로그램 종료");
	}

}
