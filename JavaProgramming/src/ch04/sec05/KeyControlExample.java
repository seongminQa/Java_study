package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int speed = 0;

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-------------------------");
			System.out.print("선택: ");

			String strNum = scanner.nextLine();

			// if문으로 해보자.
			if (strNum.equals("1")) {
				speed++;
				System.out.println("속도를 올립니다.");
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("2")) {
				speed--;
				System.out.println("속도를 내립니다.");
				System.out.println("현재 속도 = " + speed);
			} else if (strNum.equals("3")) {
				System.out.println("정지합니다.");
				//break;
				run = false;
			} else {
				System.out.println("(경고!!) 1,2,3번 중에서 선택해주세요.");
				continue;
			}

			// switch문으로 해보자.
			/*switch(strNum) {
				case "1":{
					speed++;
					System.out.println("속도를 올립니다.");
					System.out.println("현재 속도 = " + speed);
					break;
				}
				case "2":{
					speed--;
					System.out.println("속도를 내립니다.");
					System.out.println("현재 속도 = " + speed);
					break;
				}
				case "3":{
					System.out.println("정지합니다.");
					run = false;
					break;
				}
				default:{
					System.out.println("(경고!!) 1,2,3번 중에서 선택해주세요.");
					continue;
				}
					
			}*/

		}

		System.out.println("프로그램을 종료합니다.");

	}

}
