package ch02.sec03;

public class CharExample {

	public static void main(String[] args) {

		char c1 = 'A';
		char c2 = 65;	// char는 정수 타입이다.
		char c3 = '가';
		char c4 = 44032;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		// char 타입의 변수 초기화방법
//		char c5 = ''; // 컴파일 에러가 일어난다. 작은따옴표 사이에 공백하나를 두어서 초기화 시킨다.
		char c6 = ' '; // 빈 문자(공백)는 숫자와 매핑되어있어서 에러가 생기지 않는다.
		
	}

}
