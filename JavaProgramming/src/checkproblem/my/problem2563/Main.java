package checkproblem.my.problem2563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 색종이의 넓이를 구하기 위한 배열 선언
		// 참조 변수이기 때문에 기본값은 0으로 초기화 됨.
		int[][] arry = new int[100][100];
		int cnt=0;
		int sum=0;
		// 색종이 수 입력
		int num = scan.nextInt();
		
		// 색종이 수만큼 반복
		while(cnt < num) {
			
			// 색종이의 위치 입력받기
			int first = scan.nextInt();
			int second = scan.nextInt();
			
			for(int i=first; i<first+10; i++) {
				for(int j=second; j<second+10; j++) {
					arry[i][j] = 1;
				}
			}
			cnt++;
		}
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				sum += arry[i][j];
			}
		}
		System.out.print(sum);
		
	}

}
