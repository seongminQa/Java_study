package ch02.sec13;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		String input = scanner.nextLine();	// nextLine -> 사용자가 엔터를 치면 입력이 끝난다는 의미
//		System.out.println("입력한 내용 : " + input);
		
		/*while(true) {
				System.out.print("x 값 입력: ");
				String strX = scanner.nextLine();
				int x = Integer.parseInt(strX);
				
				System.out.print("y 값 입력: ");
				String strY = scanner.nextLine();
				int y = Integer.parseInt(strY);
				
				int result = x + y;
				System.out.println("x + y : " + result);
				System.out.println();
			
		}*/
		
		while(true) {
			System.out.print("입력 문자열: ");
			String data = scanner.nextLine();
			
			if (data.equals("q")) {
				break;
			}
			
			System.out.println("출력 문자열: " + data);
			System.out.println();
		}
		
		System.out.println("종료");
	}

}
