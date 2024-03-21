package beakjoon.problem2839;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 설탕의 무게를 입력받는다.
		int num = scan.nextInt();
		int min = 0;
		int sum;
		int cnt = 0;

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (5 * i + 3 * j == num) {
					cnt++;
//					System.out.println("i:" + i + "  j: " + j);
					sum = i + j;
					if(cnt==1) // 맨 처음만
						min = sum;
					if (min < sum) 
						min = min;
					else 
						min = sum;
				}

			}
		}
		if (min == 0)
			System.out.println(-1);
		else
			System.out.println(min);

	}

}
