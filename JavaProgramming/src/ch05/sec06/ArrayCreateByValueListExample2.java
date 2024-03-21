package ch05.sec06;

public class ArrayCreateByValueListExample2 {

	public static void main(String[] args) {

		int[] score;
		score = new int[] { 83, 90, 87 };
		
		int sum1 = 0;
		for(int i=0; i<score.length; i++) {
			sum1 += score[i];
		}
		System.out.println("총합 : " + sum1);
		
		
		// printItem() 메소드 호출
		printItem( new int[] { 83, 90, 87 } );
		
		System.out.println("프로그램 종료");
	}
	
	// printItem() 메소드 선언
	public static void printItem(int[] args) {
		for(int i=0; i<args.length; i++) {
			System.out.println("args[" + i + "]: " + args[i]);
		}
	}

}
