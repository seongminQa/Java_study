package ch12.sec07;

import java.util.Arrays;
import java.util.Random;

public class RandomExample {

	public static void main(String[] args) {
		// 로또 번호 생성해보기
		// 선택 번호
		int[] selectNum = new int[6];
		Random random = new Random(5);
		
		System.out.println("선택번호: ");
		for(int i=0; i<6; i++) {
			selectNum[i] = random.nextInt(45) + 1;
			System.out.print(selectNum[i] + " ");
		}
		System.out.println();
		
		
		// 당첨번호
		int[] winningNum = new int[6];
		random = new Random(5);
		System.out.println("당첨번호: ");
		for(int i=0; i<6; i++) {
			winningNum[i] = random.nextInt(45) + 1;
			System.out.print(winningNum[i] + " ");
		}
		System.out.println();
		
		
		// 당첨여부
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		
		// 정렬 확인해보기
		for(int i=0; i<6; i++) {
			System.out.print(winningNum[i] + " ");
		}
		System.out.println();
		
		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.println("당첨여부: ");
		
		if(result) {
			System.out.println("1등에 당첨되셨습니다!");
		} else {
			System.out.println("낙첨되셨습니다 ㅠㅠ");
		}
	}

}
