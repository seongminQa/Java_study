package practice.february;

import java.util.Scanner;

public class Two {

	public static void main(String[] args) {

		/*
		boolean과 char를 제외한 Java 기본 자료형 6가지를
		메모리(byte) 크기에 따라 문자열을 선언하고, 각각의 타입으로
		변환하여 출력하는 코드를 작성
		*/
		
		// 문자열 타입을 각 기본타입에 맞게 변형하는 과정
		String byteSring = "127";
		byte byteSize = Byte.parseByte(byteSring);
		System.out.println(byteSize);
		
		String shortString = "257";
		short shortSize = Short.parseShort(shortString);
		System.out.println(shortSize);
		
		String intString = "210000000";
		int intSize = Integer.parseInt(intString);
		System.out.println(intSize);
		
//		String longString = "5000000000L";
		String longString = "21000";
		long longSize = Long.parseLong(longString);
		System.out.println(longSize);
		
		String floatString = "2100000000";
//		String floatString = "2100000000f";
		float floatSize = Float.parseFloat(floatString);
		System.out.println(floatSize);
		
		String doubleString = "0.1";
		double doubleSize = Double.parseDouble(doubleString);
		System.out.println(doubleSize);
		
		System.out.println();
		
		/*
		값이 0으로 초기화된 변수 var가 증감연산자로 1씩 증가하며 출력되고
		10이 되면 반복이 멈추는 반복문 while 코드 작성
		 */
		
		int var = 0;
		
		while(true) {
			var++;
//			System.out.printf("var = %d\n", var);
			System.out.println("var = " + var);
			
			if (var == 10) {
				System.out.println("var가 10이 되어 반복문을 종료합니다.");
				break;
			}
		}
		System.out.println();
		
		while (var < 20) {
			var++;
			System.out.println("var = " + var);
		}
		System.out.println("var가 20이 되어 반복문을 종료합니다.");
		
		System.out.println();
		
		/*
		스캐너로 변수 alphabet에 문자 하나를 입력받아
		대문자 or 소문자 or 숫자를 판별하는 코드 작성
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("알파벳 또는 숫자를 입력하세요 : ");
		
		char alphabetCheck = scanner.next().charAt(0);
		
		if ( (65<=alphabetCheck) && (alphabetCheck<=90) ) {
			System.out.println("대문자이군요.");
		}
		
		if ( (97<=alphabetCheck) && (alphabetCheck<=122) ) {
			System.out.println("소문자이군요.");
		}
		
		if ( (48<=alphabetCheck) && (alphabetCheck<=57) ) {
			System.out.println("0~9 숫자이군요.");
		}
		
		
	}

}
