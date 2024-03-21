package ch11.sec02.exam03;

public class ExceptionHandlingExample {
	
	public static void main(String[] args) {
		// 이번에는 컴파일(실행) 예외가 아닌 일반 예외
		
		try {
			Class.forName("java.lang.String");
			System.out.println("해당 클래스가 존재합니다.");
		} catch (ClassNotFoundException e) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
			System.out.println(e.getMessage());	// 일반 예외는 메시지를 반환해주지 않음
												// 컴파일 자체를 안해주기 때문이다.
												// 확인하기;
		}
		
	}

}
