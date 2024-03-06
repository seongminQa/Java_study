package ch02.sec02;

public class LongExample {

	public static void main(String[] args) {
		
		long v1 = 10;
		long v2 = 20L;
//		long v3 = 10000000000; // Java는 숫자를 기본적으로 4byte(int범위)까지 인식하기 때문에 범위를 넘으면 뒤에 'L'을 붙여주어야 한다.
		long v4 = 10000000000L;
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v4);

	}

}
