package ch05.sec04;

public class AdressTest {

	public static void main(String[] args) {
		
		int[] intArr1 = {1,2,3,4,5};
		int[] intArr2 = {6,7,8,9,10};
		
		System.out.println(intArr1);
		System.out.println(intArr2);
		
		intArr2 = intArr1;
		System.out.println(intArr2);
		
	}

}
