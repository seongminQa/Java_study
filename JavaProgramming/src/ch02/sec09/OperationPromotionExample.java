package ch02.sec09;

public class OperationPromotionExample {

	public static void main(String[] args) {

		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte v1 = 10;
		byte v2 = 20;
		int result2 = v1 + v2;
		System.out.println(result2);
		
		byte v3 = 10;
		int v4 = 100;
		long v5 = 1000L;
		long result3 = v3 + v4 + v5;
		
		char v6 = 'A';
		char v7 = 1;
		int result4 = v6 + v7;
		System.out.println( (char) result4);
		
		int v8 = 10;
		int result5 = v8 / 4;
		System.out.println(result5);
		
		int v9 = 10;
		double result6 = (double) v9 / 4;
		System.out.println(result6);
		
		int v10 = 10;
		double result7 = v10 / 4.0;
		System.out.println(result7);
		
		int v11 = 10;
		double result8 = (double) (v11 / 4);
		System.out.println(result8);
		
		// 별도
		String str = "3" + 7;
		System.out.println(str);
		
		String str2 = "3" + 3.14;
		System.out.println(str2);
		
	}

}
