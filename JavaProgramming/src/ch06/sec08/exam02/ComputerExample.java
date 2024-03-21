package ch06.sec08.exam02;

public class ComputerExample {

	public static void main(String[] args) {

		int[] arr1 = {10,20,30};
		
		Computer com = new Computer();
		
		int result1 = com.sum1(arr1);
		System.out.println("result1 = " + result1);
		
		int result2 = com.sum2(arr1);
		System.out.println("result2 = " + result2);
		
		int result3 = com.sum1(new int[] {10,20,40});
		System.out.println("result3 = " + result3);
		
		int result4 = com.sum2(10,20,40);
		System.out.println("result4 = " + result4);
	}

}
