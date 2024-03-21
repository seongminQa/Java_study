package beakjoon;

import java.util.Scanner;

public class Question1008 {

	public static void main(String[] args) {

		int a;
		int b;
		String[] arry = new String[2];
		
		double result;
		
		// 키보드로 입력 받은 값들은 String 타입이다.
		Scanner scan = new Scanner(System.in);
		
//		a = Integer.parseInt(scan.nextLine());
//		a = scan.nextInt();
//		b = scan.nextInt();
		arry = scan.nextLine().split(" ");
		a = Integer.parseInt(arry[0]);
		b = Integer.parseInt(arry[1]);
		
		result = (double) a / b;
		
		System.out.println(result);
	}

}
