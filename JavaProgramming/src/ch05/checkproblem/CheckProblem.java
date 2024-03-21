package ch05.checkproblem;

import java.util.Scanner;

public class CheckProblem {

	public static void main(String[] args) {

		// 확인문제 6번
		/*int[][] array = {
			{95, 86},
			{83, 92, 96},
			{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);*/
		
		
		// 7번
		/*int[] array = {1,5,3,8,2};
		
		// 최대값 출력
		int max=0;
		for (int i=0; i<array.length; i++) {
			if(max < array[i]) {
				max = array[i];
			}
		}*/
		
		
		// 8번
		
		
		
		// 9번
		// 학생들의 점수를 분석하는 프로그램
		// scanner 사용
		// while문 사용
		// 
		
		Scanner scanner = new Scanner(System.in);
		
		int studentNum = 0;
		int[] scores = null;
		int max = 0;
		double avg = 0;
		
		while(true) {			
			System.out.print("""
					-----------------------------------------------
					1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료
					-----------------------------------------------
					""");
			System.out.print("선택> ");
			int sellectNum = Integer.parseInt(scanner.nextLine());

			
			// 1~5 선택으로 인한 메뉴
			if(sellectNum == 1) {
				System.out.print("학생 수> ");
				studentNum = Integer.parseInt(scanner.nextLine());
			}
			else if(sellectNum == 2) {
				scores = new int[studentNum];
				int sum = 0;
				
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(scanner.nextLine());
					sum += scores[i];
				}
				
				avg = (double) sum / scores.length;
			}
			else if(sellectNum == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			}
			else if(sellectNum == 4) {
				for(int i=0; i<scores.length; i++) {
					max = (max<scores[i]) ? scores[i] : max;
				}
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			}
			else if(sellectNum == 5) {
				System.out.print("프로그램 종료");
				break;
			}
			
			
			
		}
		
		
		
	}

}
