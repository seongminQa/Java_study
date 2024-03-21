package checkproblem.my.first;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		// 20번

				// 각 프로그램 실행에 따라 키보드를 입력받기위해 scan 선언
				Scanner scan = new Scanner(System.in);

				// 객체 배열 선언
				Account[] ac = new Account[100];

				// 계좌의 개수를 카운트하기 위한 변수 선언
				int cnt = 0;
				
				// 금액을 입력받는 과정에서 문자를 입력할 경우, 판별하기 위한 변수
				int check;

				while (true) {
					// 프로그램 실행화면의 공통적 반복 부분
					System.out.println("""
							--------------------------------------------
							1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료
							--------------------------------------------
							""");

					System.out.print("선택: ");
					String choice = scan.nextLine();
					System.out.println(); // 보기 좋게 한칸 뛰어주기

					
					if (choice.equals("1")) {
						// 계좌생성

						// 계좌생성 화면
						System.out.println("""
								------------
								  계좌 생성
								------------
								""");

						// 계좌의 개수에 따라 생성하기
						if (cnt < 100) {
							// 하나의 계좌 객체 만들기
							ac[cnt] = new Account();
							
							// 계좌번호, 계좌주, 초기입금액 입력받고, 배열에 값을 저장하기
							
							// 계좌번호 길이 제한 7(O), 계좌번호 형식 맞추기**
							// 계좌번호 형식 "xxx-xxx"라고 할때, 이 형식이 유지되게끔 입력값 길이 제한하기
							// 계좌번호 중복 제한** --> 싱글톤으로 가능할까..?
							// 한 사람의 계좌번호.. 고유의 값을 지님..
							while(true) {
								System.out.print(" 계좌 번호: ");
								String leng = scan.nextLine();
								if(leng.length() == 7) {
									ac[cnt].account = leng;
									break;
								} else {
									System.out.println("계좌번호는 \"xxx-xxx\" 형식이며, \"-\"를 포함하여 총 7길이로 입력해주세요.");
									continue;
								}
								
							}

							System.out.print(" 계좌 주: ");
							ac[cnt].name = scan.nextLine();

							System.out.print(" 초기입금액: ");
							// 초기입금액 유효성 검사
							// 알파벳을 입력받는 경우 에러처리 추가
							while(true) {
								try {
									check = Integer.parseInt(scan.nextLine());
									if(check < 0) {
										System.out.println("초기입금액은 음수가 될 수 없습니다!");
										System.out.print("다시 입력해주세요: ");
										continue;
									}
									else {
										ac[cnt].balance = check;
										break;
									}
									
								} catch (NumberFormatException e){
									System.out.println("숫자만 입력하셔야 됩니다!");
									System.out.print("다시 입력해주세요: ");
									continue;
								}
							}
							// 총 계좌의 개수를 확인하여 결과값 반환
							System.out.println(" 결과: 계좌가 생성되었습니다.");
							cnt++;
						} else {
							System.out.println(" 결과: 더이상 계좌를 생성할 수 없습니다.");
						}

					} else if (choice.equals("2")) {
						// 계좌 목록 보여주기

						// 화면 구성
						System.out.println("""
								------------
								  계좌 목록
								------------
								""");
						
						for (int i = 0; i < cnt; i++) {
							// 계좌 번호 맨 뒷자리 3글자만 공개해보기
							System.out.println(ac[i].account.substring(0,4) + "xxx\t\t" + ac[i].name + "\t" + ac[i].balance);
						}
						System.out.println();

					} else if (choice.equals("3")) {
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
						for (int i = 0; i < cnt; i++) {
							// 계좌번호 조회에 성공하면 예금액 입력받고 저장하기
							if (ac[i].account.equals(acnum)) {
								System.out.print("예금액: ");
								
								// 금액의 유효성 검사 (예금액이 음수인지 아닌지 확인)
								// 알파벳을 입력받는 경우 에러처리 추가
								while(true) {
									try {
										check = Integer.parseInt(scan.nextLine());
										if(check < 0) {
											System.out.println("예금액은 음수가 될 수 없습니다!");
											System.out.print("다시 입력해주세요: ");
											continue;
										}
										else {
											ac[i].balance += check;
											System.out.println("정상 예금 되었습니다.");
											break;
										}
									} catch (NumberFormatException e){
										System.out.println("숫자만 입력하셔야 됩니다!");
										System.out.print("다시 입력해주세요: ");
										continue;
									}
								}
							// 해당 계좌가 없을 경우, 존재하지 않음을 알리며 예금액 입력받지 않음
							// 밑의 조건식이 맞는지 확인**
							// ex) 계좌의 갯수가 많아져, 100을 초과하게 될 경우..**
							} else if (i == cnt) {
								System.out.println("해당 계좌는 존재하지 않습니다!");
							}
						}
					} else if (choice.equals("4")) {
						// 출금 기능

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
						for (int i = 0; i < cnt; i++) {
							// 계좌번호 조회에 성공하면 예금액 입력받고 저장하기
							if (ac[i].account.equals(acnum)) {
								System.out.print("출금액: ");
								
								// 금액의 유효성 검사 (출금액이 잔액보다 많은지 확인)
								// 알파벳을 입력받는 경우 에러처리 추가
								while(true) {
									try {
										check = Integer.parseInt(scan.nextLine());
										if(check < 0) {
											System.out.println("출금액은 음수가 될 수 없습니다!");
											System.out.print("다시 입력해주세요: ");
											continue;
										}
										else if (ac[i].balance - check < 0){
											System.out.println("잔액보다 출금하려는 금액이 높습니다!");
											System.out.print("다시 입력해주세요: ");
											continue;
										} else {
											ac[i].balance -= check;
											System.out.println("정상 출금 되었습니다.");
											break;
										}
									} catch (NumberFormatException e){
										System.out.println("숫자만 입력하셔야 됩니다!");
										System.out.print("다시 입력해주세요: ");
										continue;
									}
								}

							// 해당 계좌가 없을 경우, 존재하지 않음을 알리며 예금액 입력받지 않음
							} else if (i == cnt) {
								System.out.println("해당 계좌는 존재하지 않습니다!");
							}
						}
					} else if(choice.equals("5")) {
						System.out.println("프로그램을 종료합니다.");
						break;
					} else {	// 정수가 아닌, 문자를 입력받았을 때의 예외처리 추가하기
						System.out.println("1 ~ 5번으로 선택해주십시오.");
					}

				}

	}

}
