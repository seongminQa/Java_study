package ch05.sec03;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {

		// int 배열 변수 선언
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		arr1 = new int[] {1,2,3}; // 새로운 int타입 배열 객체 생성
		arr2 = new int[] {1,2,3}; // 새로운 int타입 배열 객체 생성
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		
		System.out.println(arr2 == arr3);
		
		System.out.println(arr1);
		System.out.println(arr3);
	}

}
