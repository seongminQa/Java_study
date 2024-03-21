package ch04.sec04;

public class SumFrom1To100Example {

	public static void main(String[] args) {

		int sum = 0;
		int i;
		int j;
		
		for(i=1; i<=100; i++) {
			sum += i;
		}
		
		System.out.println("1~" + (i-1) + "의 합은 :" + sum);
		
		sum = 0;
		// 두번째 방식
		for(j=1; j<101; j++) {
			sum += j;
		}
		
		System.out.println("1~" + (j-1) + "의 합은 :" + sum);
	
	}

}
