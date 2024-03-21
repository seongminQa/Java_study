package ch06.sec08.exam02;

public class Computer {
	
	// 필드(Field) 선언
	
	
	// 생성자(Constructor) 선언
	
	
	// 메소드(Method) 선언
	
	// 배열 매개변수으로 선언
	int sum1(int[] values) {
		int result = 0;
		for(int value : values) {
			result += value;
		}
		return result;
	}
	
	// 가변길이 매개변수로 선언
	int sum2(int ... values) {
		int result = 0;
		for(int i=0; i<values.length; i++) {
			result += values[i];
		}
		return result;
	}
	
}
