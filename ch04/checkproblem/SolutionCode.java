package ch04.checkproblem;

import java.util.Scanner;

public class SolutionCode {

	public static void main(String[] args) {
		
		// 3번
		// for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드 작성
		int i, sum=0;
		for(i=3; i<=100; i = i + 3) {
			sum = sum + i;
			System.out.print(i + " ");
		}
		System.out.println("\n1~100까지 3의 배수 총합은 : " + sum);
		

		System.out.println();
		// 4번
		// while문과 Math.random()메소드를 이용하여 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2) 형태로 출력하고,
		// 눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성하시오.
		int count = 0;
		while(true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			int result = num1 + num2;
			count++;
			if(result == 5) {
				System.out.println("주사위의 수가 (" + num1 + ", " + num2 + ") 이므로 합이 5입니다.");
				System.out.println("눈의 합이 5이기 때문에 실행을 중지합니다.");
				System.out.println("총 " + count + "번 수행하였습니다.");
				break;
			}
			else {
				System.out.println("주사위의 수가 (" + num1 + ", " + num2 + ") 입니다.");
				System.out.println("눈의 합이 5가 아니기 때문에 실행을 계속합니다.");
				continue;
			}
			
		}
		
		
		System.out.println();
		// 5번
		// 중첩 for문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y)형태로 출력하는 코드를 작성하시오.
		// 단, x,y 는 10이하의 자연수
		int x;
		int y;
		
		for(x=1; x<=10; x++) {
			
			for(y=1; y<=10; y++) {
				if( 4*x + 5*y == 60 ) {
					System.out.println("(" + x + "," + y + ")");
				}
			}
		}
		
		
		System.out.println();
		// 6번 for문을 이용하여 다음 삼각형을 출력해보시오.
		/*
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */
		
		for(int ii=1; ii<=5; ii++) {
			for(int jj=1; jj<=ii; jj++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println();
		// 7번
		// while문과 Scanner의 nextLine()메소드를 이용하여 다음 실행 결과와 같이 키보드로부터 입력된 데이터로
		// 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성해보시오.
		Scanner scanner = new Scanner(System.in);
		int cash = 0;
		
		while(true) {
			System.out.println("-----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------");
			
			System.out.print("선택 > ");
			String stringNum = scanner.nextLine();
			
			// if문을 사용한다면
			if(stringNum.equals("1")) {
				System.out.print("예금액 > ");
				String cashIn = scanner.nextLine();
				cash += Integer.parseInt(cashIn);
				System.out.println();
			}
			else if(stringNum.equals("2")) {
				System.out.print("출금액 > ");
				String cashOut = scanner.nextLine();
				if(cash < Integer.parseInt(cashOut)) {
					System.out.println("잔고보다 출금하려는 금액이 더 많습니다.");
					System.out.println("현재 잔고 : " + cash);
					System.out.println("출금을 취소합니다.");
				}
				else {
					cash -= Integer.parseInt(cashOut);
				}
				System.out.println();
			}
			else if(stringNum.equals("3")) {
				System.out.println("잔고 > " + cash);
				System.out.println();
			}
			else if(stringNum.equals("4")) {
				break;
			}
			else {
				System.out.println("1 ~ 4번으로만 입력해주십시오.");
				continue;
			}
			

		}
		System.out.print("프로그램을 종료합니다.");
		
	}

}
