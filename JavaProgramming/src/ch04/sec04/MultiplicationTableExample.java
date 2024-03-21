package ch04.sec04;

public class MultiplicationTableExample {

	public static void main(String[] args) {

		// 구구단 출력 프로그램 구현해보기
		for(int n=2; n<=9; n++) {
			System.out.println("***** " + n + "단 *****");
			
			for(int m=1; m<=9; m++) {
				System.out.println(n + " x " + m + " = " + (n*m));
			}
//			System.out.println();
		}
		
	}

}
