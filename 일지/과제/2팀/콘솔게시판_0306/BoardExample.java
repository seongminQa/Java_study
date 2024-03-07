package Homework.Q1;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] board = new String[100][4];
		Scanner input = new Scanner(System.in);
		board[0][0] = "1";
		board[0][1] = "첫번째 과제입니다.";
		board[0][3] = "홍길동";
		board[1][0] = "2";
		board[1][1] = "팀별 경쟁하는 방법";
		board[1][3] = "김길동";
		while (true) {
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("번호            제목                     글쓴이");
			System.out.println("--------------------------------------------");
			System.out.println();
			for (int i = 99; i >= 0; i--) {
				if (board[i][0] != null) {
					System.out.printf("%s%20s%18s\n", board[i][0], board[i][1], board[i][3]);
				}
			}
			System.out.println();
			System.out.println("메뉴: 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");
			System.out.println("선택 > ");
			String strNum = input.nextLine();
			if (strNum.equals("1")) {
				System.out.print("제목 > ");
				String title = input.nextLine();
				System.out.print("내용 > ");
				String content = input.nextLine();
				System.out.print("글쓴이 > ");
				String author = input.nextLine();
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] == null) {
						board[i][0] = i + 1 + "";
						board[i][1] = title;
						board[i][2] = content;
						board[i][3] = author;
						break;
					}

				}
			} else if (strNum.equals("2")) {
				System.out.println("게시물 번호 입력 > ");
				String strPost = input.nextLine();
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] != null && board[i][0].equals(strPost)) {
						System.out.println();
						System.out.println("번호: " + board[i][0]);
						System.out.println("제목: " + board[i][1]);
						System.out.println("글쓴이: " + board[i][3]);
						System.out.println("내용: " + board[i][2]);
						break;
					}
				}
			} else if (strNum.equals("3")) {
				System.out.println("게시물 번호 입력 > ");
				String strPost = input.nextLine();
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] != null && board[i][0].equals(strPost)) {
						System.out.print("제목 > ");
						String title = input.nextLine();
						System.out.print("내용 > ");
						String content = input.nextLine();
						System.out.print("글쓴이 > ");
						String author = input.nextLine();

						board[i][1] = title;
						board[i][2] = content;
						board[i][3] = author;

						break;
					}
				}

			} else if (strNum.equals("4")) {
				System.out.println("게시물 번호 입력 > ");
				String strPost = input.nextLine();
				for (int i = 0; i < board.length; i++) {
					if (board[i][0] != null && board[i][0].equals(strPost)) {
						board[i][0] = null;
						board[i][1] = null;
						board[i][2] = null;
						board[i][3] = null;
						System.out.println("게시물이 삭제되었습니다.");
						for (int j = i; j < 100 - 1; j++) {
							if (board[j + 1][0] != null) {
								board[j][0] = board[j + 1][0];
								board[j][1] = board[j + 1][1];
								board[j][2] = board[j + 1][2];
								board[j][3] = board[j + 1][3];

								board[j + 1][0] = null;
								board[j + 1][1] = null;
								board[j + 1][2] = null;
								board[j + 1][3] = null;
							}
						}
						break;
					}
				}

			} else if (strNum.equals("5")) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}

		}
	}
}
