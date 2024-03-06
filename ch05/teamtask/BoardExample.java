package ch05.teamtask;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		String[][] board = new String[100][4];
		
		int count = 0; // 글 번호
		int i;			// for문 i

		while (true) {

			System.out.println("-------------------------------------");
			System.out.println(" 번호\t제목\t\t\t글쓴이");
			
			// 인덱스를 기준으로 내림차순 출력
			for(i=99; i>=0; i--) {
				if(board[i][0] != null) {
					System.out.println("  "+board[i][0]+"\t"+board[i][1]+"\t\t\t "+board[i][2]);
				}
			}
			System.out.println("-------------------------------------");

			// 메뉴
			System.out.println("메뉴: 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");
			System.out.print("선택: ");
			int selectNum = Integer.parseInt(scanner.nextLine());

			
			// 메뉴 선택 시작
			if (selectNum == 1) {
				System.out.println("\n[새글쓰기]");

				// 새로운 게시물 등록
				// String 타입으로 번호를 저장
				// 인덱스가 0부터 100까지 인덱스 오름차 순으로 입력값을 받음
				for(i=0; i<100; i++) {
					if(board[i][0] == null) {
						board[count][0] = String.valueOf(count+1);
						System.out.print("제목: ");
						board[count][1] = scanner.nextLine();
						System.out.print("글쓴이: ");
						board[count][2] = scanner.nextLine();
						System.out.print("내용: ");
						board[count][3] = scanner.nextLine();
						count++;	// 게시물 번호 자동 증가
						break;
					}
				}
				
				System.out.println();
				// 게시물 등록 끝
			} 
			else if (selectNum == 2) {
				System.out.print("\n게시물 번호: ");

				// 게시물을 번호로 찾아서 보여주기
				String boardNum = scanner.nextLine();
				
				// 삭제 후, 인덱스와 글의 번호의 순서가 바뀔 수 있으니 for문 무조건 사용해야한다.
				for(i=0; i<100; i++) {
					if(board[i][0] != null){
						if(board[i][0].equals(boardNum)) {
							System.out.println("[글보기]");
							System.out.println("번호: " + board[i][0]);
							System.out.println("제목: " + board[i][1]);
							System.out.println("글쓴이: " + board[i][2]);
							System.out.println("내용: " + board[i][3]);
							break;
						}
					}
					else if(i == 99) {
						System.out.println("해당 글은 없거나, 삭제되었습니다!");
					}
				}
				// 게시물 번호로 보여주기 끝
				System.out.println();
			}
			else if (selectNum == 3) {
				System.out.print("\n 수정할 게시물 번호: ");

				String boardNum = scanner.nextLine();
				
				// 수정할 게시물을 번호로 찾기
				for(i=0; i<100; i++) {
					if(board[i][0] != null) {
						if(board[i][0].equals(boardNum)) {
							System.out.println("[글수정]");
							System.out.print("제목: ");
							board[i][1] = scanner.nextLine();
							System.out.print("내용: ");
							board[i][3] = scanner.nextLine();
							break;
						}
					}
					else if(i == 99) {
						System.out.println("해당 글은 없거나, 삭제되었습니다!");
					}
				}
				// 수정하고 저장하기 끝
				System.out.println();
			} 
			else if (selectNum == 4) {
				System.out.print("\n 삭제할 게시물 번호: ");

				String boardNum = scanner.nextLine();
				
				// 게시물 번호를 찾아 내용 삭제(null)하기.
				for(i=0; i<100; i++) {
					if(board[i][0] != null) {
						if(board[i][0].equals(boardNum)) {
							board[i][0] = null;
							board[i][1] = null;
							board[i][2] = null;
							board[i][3] = null;
							break;
						}
					}
					else if(i == 99) {
						System.out.println("해당 글은 없거나, 삭제되었습니다!");
					}
				}
				// 삭제하고 null값으로 채워넣기 끝
				System.out.println();
			} 
			else if (selectNum == 5) {
				System.out.print("프로그램을 종료합니다! 감사합니다.");
				break;
			} 
			else {
				System.out.println("1부터 5까지의 숫자만 입력해주세요 !");
				continue;
			}

		}

	}

}
