package ch02.sec10;

public class PrimitiveAndStringConversionExample {

	public static void main(String[] args) {

		int value1 = Integer.parseInt("10");	// 문자열을 정수형으로 바꾸고 싶을 때
		double value2 = Double.parseDouble("3.14");
		Boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3 + "\n");
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3 + "\n");
		
		String str4 = String.valueOf(value1);	// 다른 타입의 값을 문자열로 바꾸고 싶을 때
		String str5 = String.valueOf(value2);
		String str6 = String.valueOf(value3);
		
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
		
	}

}
