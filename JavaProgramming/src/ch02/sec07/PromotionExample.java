package ch02.sec07;


public class PromotionExample {

	public static void main(String[] args) {

		byte byteValue = 10;
		int intValue = byteValue;	// 큰 허용 범위 타입 = 작은 허용 범위 타입 --> 자동 타입 변환됨
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;
		System.out.println(intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println(intValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println(floatValue);
		
		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println(doubleValue);
		
		
		
	}

}
