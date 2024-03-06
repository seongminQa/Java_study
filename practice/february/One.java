package practice.february;
import java.time.LocalTime;

public class One {

	public static void main(String[] args) {

		// 4byte 크기의 정수형 a에 100을 대입하고 b에 20을 대입한 후 사칙연산 4가지를 출력하는 코드
		int a = 100, b = 20;
		
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println();
		
		
		// 현재 시간을 시:분:초로 출력하고 초로 변환하여 출력하기
		
		// 현재 시간
		LocalTime now = LocalTime.now();
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		
		System.out.println("현재 시간 : " + hour + ":" + minute + ":" + second);
		System.out.println();
		
		
		// E와 G를 각각 문자, 유니코드 숫자를 대입하여 출력하기
		char var1 = 'E';
		char var2 = 'G';
		char var3 = 69;
		char var4 = 71;
		
		System.out.println("var1 = " + var1);
		System.out.println("var2 = " + var2);
		System.out.println("var3 = " + var3);
		System.out.println("var4 = " + var4);
		System.out.println();
		
		
		// 다음 문자열을 그대로 출력하기
		/*
		"집
		   에
		 가'고'싶
		 다"
		 */
		
		String str =
				"""
				"집
				  에
				가'고'싶
				다"
				""";
		
		System.out.println(str);

		
		// 유현주님 질문 교수님 답변
		// 메모리 주소의 값에 대한 질문
		int q = 10;
		int w = 10;
		// 예를들면 a변수는 스택영역의 메모리 5번지, b변수는 스택영역의 메모리 7번지에 저장됨
		boolean result = q==w;		// 기본 타입은 '값'으로 비교를 한다.
		System.out.println(result);	// 따라서 true를 반환하게 된다. (메모리 주소값을 비교하는 것이 아님)
		// '참조 타입'에서 메모리 주소를 자세히 다뤄보자. (5장 부터)
		// Java에서는 메모리 번지를 출력하는 방법이 없다. JVM에서 알아서 동작하기 때문에 (자동적으로 랜덤으로 메모리 지정)
		

	}

}
