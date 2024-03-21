package ch04.sec04;

public class PrintFrom1To10Example {

	public static void main(String[] args) {

		int sum = 0;
		
		for(int i = 1; i <= 10; i++) {
			System.out.print("i = " + i + "\t");	// i의 증가를 확인하기 위해 콘솔창에 출력
			sum += i;
		}
		System.out.println("\n총 합은 : " + sum);		// 반복문 안의 i를 이용하여 1~10의 값을 출력
		
		// 2씩 증가하는 for문
		for(int i=1; i<=10; i=i+2) {
			System.out.print(i + " ");
		}
	
	}

}
