package subject.march.problem;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		// 20번
		
		// 각 프로그램 실행에 따라 키보드를 입력받기위해 scan 선언
		Scanner scan = new Scanner(System.in);
		
		// 100개의 계좌정보를 저장할 배열 선언
		// 계좌를 저장할 100개의 배열 and 해당 계좌의 번호,주,금액 정보를 저장할 3개의 배열 선언
		String[][] array = new String[100][3];
		
		// 계좌의 개수를 카운트하기 위한 변수 선언
		int cnt=0;
		
		// 계좌 프로그램 반복문
		while(true) {
			// 프로그램 실행화면의 공통적 반복 부분
			System.out.println("""
					--------------------------------------------
					1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
					--------------------------------------------
					""");
			
			System.out.print("선택: ");
			int choice = Integer.parseInt(scan.nextLine());
			System.out.println(); // 보기 좋게 한칸 뛰어주기
			
			
			if(choice == 1) {
				// 계좌생성
				// 계좌번호 중복현상 제거하기 **
				Account person = new Account();
				
				// 계좌생성 화면
				System.out.println("""
						------------
						  계좌 생성
						------------  
						""");
				
				// 계좌의 개수에 따라 생성하기
				if(cnt < 100) {
					// 계좌번호, 계좌주, 초기입금액 입력받고, 배열에 값을 저장하기
					System.out.print(" 계좌 번호: ");	// 계좌번호 길이 제한해보기
					person.account = scan.nextLine();
					array[cnt][0] = person.account;
					
					System.out.print(" 계좌 주: ");
					person.name = scan.nextLine();
					array[cnt][1] = person.name;
					
					System.out.print(" 초기입금액: ");
					person.balance = Integer.parseInt(scan.nextLine());
					array[cnt][2] = String.valueOf(person.balance);
					
					// 총 계좌의 개수를 확인하여 결과값 반환
					System.out.println(" 결과: 계좌가 생성되었습니다.");
					cnt++;
					
				} else {
					System.out.println(" 결과: 더이상 계좌를 생성할 수 없습니다.");
				}

				
			} else if(choice == 2) {
				// 계좌 목록
				
				// 화면 구성
				System.out.println("""
						------------
						  계좌 생성
						------------  
						""");
				
				for(int i=0; i<cnt; i++) {
					System.out.print(
							array[i][0] + "/t" +
							array[i][1] + "/t" +
							array[i][2] + "\n");
				}
				
			} else if(choice == 3) {
				// 계좌번호를 조회하여 예금하기
				
				// 화면 구성
				System.out.println("""
						------------
						  예금
						------------  
						""");
				
				System.out.print("계좌번호: ");
				
				// 계좌번호 입력받고, 해당 계좌에 예금하기
				String acnum = scan.nextLine();
				
				// 계좌번호 찾기
				for(int i=0; i<cnt; i++) {
					// 계좌번호 조회에 성공하면 예금액 입력받고 저장하기
					if(array[i][0].equals(acnum)) {
						System.out.print("예금액: ");
						array[i][1] = scan.nextLine();
						break;
					// 해당 계좌가 없을 경우, 존재하지 않음을 알리며 예금액 입력받지 않음
					} else if(i == cnt-1) {
						System.out.print("해당 계좌는 존재하지 않습니다!");
					}
				}
				
			} else if(choice == 4) {
				// 출금기능
				
				// 화면 구성
				System.out.println("""
						------------
						  출금
						------------  
						""");
				
				System.out.print("계좌번호: ");
				
				// 계좌번호 입력받고, 해당 계좌에 출금하기
				String acnum = scan.nextLine();
				
				// 계좌번호 찾기
				for(int i=0; i<cnt; i++) {
					// 계좌번호 조회에 성공하면 예금액 입력받고 저장하기
					if(array[i][0].equals(acnum)) {
						System.out.print("출금액: ");
						array[i][1] = scan.nextLine();
						break;
					// 해당 계좌가 없을 경우, 존재하지 않음을 알리며 예금액 입력받지 않음
					} else if(i == cnt-1) {
						System.out.print("해당 계좌는 존재하지 않습니다!");
					}
				}
			}
			
			
			
		}
	}

}
