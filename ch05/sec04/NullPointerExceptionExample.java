package ch05.sec04;

public class NullPointerExceptionExample {

	public static void main(String[] args) {

		int[] intArray = null;
//		intArray[0] = 10;		// NullPointerException 에러가 일어남
		
		String str = null;
//		System.out.println("총 문자 수 : " + str);	// NullPointerException 에러가 일어남
		
		// 참조 타입의 초기화 값이 null일 경우, 객체가 생성되지 않는다.**
		
		if(intArray == null) {
			System.out.println("intArray는 null값을 가지고 있습니다.");
		}
		
		if(str == null) {
			System.out.println("str은 null값을 가지고 있습니다.");
		}
		
		int[] intTest;
		intTest = new int[] { 1, 2, 3};
		for(int i=0; i<3; i++) {
			System.out.println(intTest[i]);
		}
		System.out.println();
		
		intTest[0] = 10;
		for(int i=0; i<3; i++) {
			System.out.println(intTest[i]);
		}
		System.out.println();
		
		System.out.println("intTest의 길이는 : " + intTest.length);
		String str2 = "김성민";
		System.out.println("str2의 길이는 : " + str2.length());
		
	}

}
