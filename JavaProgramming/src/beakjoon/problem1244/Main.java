package beakjoon.problem1244;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 스위치의 개수 입력받기
		int num = scan.nextInt();

		int cnt = 0;

		// 8개의 스위치의 상태 입력 배열
		int[] swa = new int[num];

		for (int i = 0; i < num; i++) {
			swa[i] = scan.nextInt();
		}

		// 학생 수 입력받기
		int student = scan.nextInt();

		// 배열 정리
		while (cnt < student) {
			// 성별과 인덱스 입력받기
			int s = scan.nextInt();
			int index = scan.nextInt();

			// 남학생일 때, 완료.
			if (s == 1) {
				for (int i = index - 1; i < num; i += index) {
					if (swa[i] == 0) {
						swa[i] = 1;
					} else if (swa[i] == 1) {
						swa[i] = 0;
					}
				}
			}

			// 여학생일 때,
			if (s == 2) {
				int increase = 1;
				while ((index - 1) - increase >= 0 && (index - 1) + increase <= num) {
					// 선택한 인덱스의 양 옆의 값이 다를 때, 해당 인덱스의 값만 반전
					if (swa[(index - 1) - increase] != swa[(index - 1) + increase]) {
						if (swa[index - 1] == 1) {
							swa[index - 1] = 0;
							break;
						} else {
							swa[index - 1] = 1;
							break;
						}
					}

					// 선택한 인덱스의 양 옆의 값이 같을 때, 양 옆의 값을 반전
					if (swa[(index - 1) - increase] == swa[(index - 1) + increase]) {
						if (increase == 1 && swa[index - 1] == 1) {
							swa[index - 1] = 0;
						} else if (increase == 1 && swa[index - 1] == 0) {
							swa[index - 1] = 1;
						}

						if (swa[(index - 1) - increase] == 0) {
							swa[(index - 1) - increase] = 1;
							swa[(index - 1) + increase] = 1;
						} else if (swa[(index - 1) - increase] == 1) {
							swa[(index - 1) - increase] = 0;
							swa[(index - 1) + increase] = 0;
						}
					}

					increase++;
				}
			}
			cnt++;
		}
		for (int i = 0; i < num; i++) {
			System.out.print(swa[i] + " ");
		}

	}

}
