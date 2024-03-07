package team.projectt;

import java.util.Scanner;

public class BoardExample {

	public static void main(String[] args) {
		String[][] board = new String[100][4];
		boolean loop = true;
		Scanner sc = new Scanner(System.in);
		int postNo = 0; // 게시물 번호
		int idx = 0; // 현재 인덱스
		int[] content = new int[101]; // 게시물 번호별 인덱스가 저장된 배열이다

		while (loop) {
			System.out.println("--------------------------------------------");
			System.out.println("번호  제목\t\t\t글쓴이");
			System.out.println("--------------------------------------------");

			for (int i = idx; i >= 0; i--) {
				if (board[i][0] == null) {
					continue;
				}
				System.out.println(board[i][0] + " " + board[i][1] + "\t\t\t" + board[i][3]);
			}
			System.out.println("--------------------------------------------");
			System.out.println("메뉴: 1. 생성 | 2. 보기 | 3. 수정 | 4. 삭제 | 5. 종료");
			System.out.print("선택: ");
			String selectNo = sc.nextLine();
			System.out.println("");

			if (selectNo.equals("1")) {
				if (idx >= board.length) {
					System.out.println("글 초과 작성");
					continue;
				}
				System.out.println("[새글쓰기]");
				System.out.print("제목: ");
				String post = sc.nextLine();
				System.out.print("글쓴이: ");
				String name = sc.nextLine();
				System.out.print("내용: ");
				String info = sc.nextLine();
				if (post.equals("") || name.equals("") || info.equals("")) {
					System.out.println("잘못 입력하셨습니다.");
					continue;
				}
				board[idx][1] = post;
				board[idx][3] = name;
				board[idx][2] = info;
				board[idx][0] = String.valueOf(++postNo);
				content[postNo] = idx++;
			} else if (selectNo.equals("2")) {
				System.out.print("게시물 번호: ");
				String contentNo = sc.nextLine();
				System.out.println("");
				System.out.println("[글 보기]");

				if (contentNo.equals("")) {
					System.out.println("번호를 입력 안하셨습니다. 뒤로 돌아갑니다.");
					continue;
				}

				int contentNoInt = Integer.parseInt(contentNo);
				int currentPost = content[contentNoInt];
				if (board[currentPost][0] != null && board[currentPost][0].equals(contentNo)) { // 입력받은 게시물 번호와 실제 주소의
					// 게시물
					// 번호가 같다면
					System.out.println("번호: " + board[currentPost][0]);
					System.out.println("제목: " + board[currentPost][1]);
					System.out.println("글쓴이: " + board[currentPost][3]);
					System.out.println("내용: " + board[currentPost][2]);
				} else {
					System.out.println("존재하지 않는 게시글입니다.");
				}
			} else if (selectNo.equals("3")) {
				System.out.print("게시물 번호: ");
				String contentNo = sc.nextLine();

				if (contentNo.equals("")) {
					System.out.println("번호를 입력 안하셨습니다. 뒤로 돌아갑니다.");
					continue;
				}

				int contentNoInt = Integer.parseInt(contentNo);
				int currentPost = content[contentNoInt];
				if (board[currentPost][0] != null && board[currentPost][0].equals(contentNo)) { // 입력받은 게시물 번호와 실제 주소의
					// 게시물
					// 번호가 같다면
					System.out.println("");
					System.out.println("[글 수정]");
					System.out.print("제목: ");
					String post = sc.nextLine();
					System.out.print("내용: ");
					String info = sc.nextLine();
					if (post.equals("") || info.equals("")) {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
					board[idx][1] = post;
					board[idx][2] = info;
				} else {
					System.out.println("존재하지 않는 게시글입니다.");
				}

			} else if (selectNo.equals("4")) {
				System.out.print("게시물 번호: ");
				String contentNo = sc.nextLine();
				if (contentNo.equals("")) {
					System.out.println("번호를 입력 안하셨습니다. 뒤로 돌아갑니다.");
					continue;
				}
				int contentNoInt = Integer.parseInt(contentNo);
				int currentPost = content[contentNoInt];

				if (postNo == 0 || board[currentPost][0] == null) { // 글이 없거나 보드의 번호가 없다면
					System.out.println("삭제할 수 있는 게시글이 존재하지 않습니다.");
					continue;
				}

				board[currentPost][0] = null;
				board[currentPost][1] = null;
				board[currentPost][2] = null;
				board[currentPost][3] = null;

				for (int i = 0; i <= idx - 1; i++) {
					for (int j = i + 1; j <= idx; j++) {
						if (board[i][0] == null && board[j][0] != null) {
							board[i][0] = board[j][0];
							board[i][1] = board[j][1];
							board[i][2] = board[j][2];
							board[i][3] = board[j][3];
							board[j][0] = null;
							board[j][1] = null;
							board[j][2] = null;
							board[j][3] = null;
							content[Integer.parseInt(board[i][0])] = i;
							break;
						}
					}
				}
				idx--;
				if (idx > 0 && postNo > Integer.parseInt(board[idx - 1][0])) {
					postNo = Integer.parseInt(board[idx - 1][0]);
				}
			} else if (selectNo.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("선택 번호 다시 입력해주세요.");
			}

		}

	}

}
