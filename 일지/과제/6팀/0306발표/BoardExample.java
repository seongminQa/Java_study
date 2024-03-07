package ch05.sec12;
import java.util.Scanner;
public class BoardExample {

	public static void main(String[] args) {
		
		String[][] boards = new String[100][4];
		Scanner scanner = new Scanner(System.in);		
		int num = 0; // String 배열 안에 자동 증가되는 번호(순서)를 위한 변수
		
		
		while ( true ) {
			System.out.println("-----------------------------------------");
			System.out.println(" 번호        제목                   글쓴이    ");
			System.out.println("-----------------------------------------");
			
	         // 게시물 번호 중 가장 큰 숫자를 저장
	        for (int i = 0; i < num; i++) { // i를 0부터 num 전까지 반복 (num은 여태 생성된 게시물 갯수)
	        	if (boards[i][0] != null && Integer.parseInt(boards[i][0]) > num) {
	                // 만약 boards[i][0]의 값이 null이 아니면서 & num보다 게시물 번호가 크다면
	        		num = Integer.parseInt(boards[i][0]); // num에 그 게시물 번호를 정수 타입으로 바꿔서 저장
	            }
	        }

	        for (int currentPostNum = num; currentPostNum > 0; currentPostNum--) { // currentPostNum에 가장 마지막 게시물 번호를 대입
	            // currentPostNum을 1씩 감소시켜가면서 모든 게시물 번호를 확인할 수 있도록 반복함
	            for (int i = 0; i < num; i++) { // i를 0부터 num까지 반복 (num은 여태 생성된 게시물 갯수)
	                if (boards[i][0] != null && Integer.parseInt(boards[i][0]) == currentPostNum) {
	                    // 만약 boards[i][0]의 값이 null이 아니면서 & 그 값이 currentPostNum이라면
	                    System.out.printf("%3s %-20s %5s\n", boards[i][0], boards[i][1], boards[i][3]);
	                    // 위 형식으로 출력시킨다
	                }
	            }
	        }
	
			System.out.println("-----------------------------------------");
			System.out.println("메뉴 : 1.생성 | 2.보기 | 3.수정 | 4.삭제 | 5.종료");
			System.out.print("선택 : ");
			
			String select = scanner.nextLine(); // 사용자 선택을 입력받는 스캐너 변수 select
			
			if ( select.equals("1") ) { // 사용자가 생성을 선택했을 때
				
				System.out.println("[새글쓰기]");// 출력

                System.out.print("제목 : ");
                String title = scanner.nextLine();

                System.out.print("내용 : ");
                String details = scanner.nextLine();

                System.out.print("글쓴이 : ");
                String writer = scanner.nextLine();

                for (int i = 0; i <= num; i++) {
                    if (boards[i][0] == null) {

                        boards[i][0] = (num+1) + "";
                        boards[i][1] = title;
                        boards[i][2] = details;
                        boards[i][3] = writer;

                        break;
                    }
                }

                num++;
				
			} else if ( select.equals("2") ) { // 사용자가 보기를 선택했을 때
				
				System.out.print("게시물 번호 : ");
				String watchStr = scanner.nextLine();
				int watch = Integer.parseInt(watchStr) - 1;
				
				if ( boards[watch][0] != null ) {
					
					System.out.println("번호 : " + boards[watch][0]);
					System.out.println("제목 : " + boards[watch][1]);
					System.out.println("글쓴이 : " + boards[watch][3]);
					System.out.println("내용 : " + boards[watch][2]);
				
				} else {
					System.out.println("게시물이 존재하지 않습니다.");
				}
				
			} else if ( select.equals("3") ) { // 사용자가 수정을 선택했을 때
				
				System.out.print("수정할 게시물 번호를 입력하세요 : ");
				String rewriteStr = scanner.nextLine();
				int rewrite = Integer.parseInt(rewriteStr) - 1;
				
				System.out.println("[글 수정]");
				
				System.out.print("제목 : ");
				boards[rewrite][1] = scanner.nextLine();
				
				System.out.print("내용 : ");
				boards[rewrite][2] = scanner.nextLine();
				
				System.out.println(); // 개행

				// 수정이 다 끝나고 나면 수정한 게시글 다시 보여주기 (리팩토링 1)
				System.out.println("[수정한 글 보기]");
				System.out.println("번호 : " + boards[rewrite][0]);
				System.out.println("제목 : " + boards[rewrite][1]);
				System.out.println("글쓴이 : " + boards[rewrite][3]);
				System.out.println("내용 : " + boards[rewrite][2]);
						
			} else if ( select.equals("4") ) {
				
				System.out.print("삭제할 게시물 번호를 입력하세요 : ");
				String deleteStr = scanner.nextLine();
				int delete = Integer.parseInt(deleteStr) - 1;
				
				// 삭제하기 전에, 다시 한 번 물어보는 기능 추가
				while ( true ) {
					
					System.out.println("삭제한 뒤에는 복구가 불가능합니다.");
					System.out.print(deleteStr + "번 게시글을 삭제하시겠습니까? (Y/N) : ");
					
					String confirms = scanner.nextLine();
					
					if ( confirms.equals("y") || confirms.equals("Y")) {
						
						boards[delete][0] = null;
						boards[delete][1] = null;
						boards[delete][2] = null;
						boards[delete][3] = null;
					
						System.out.println("삭제가 완료되었습니다.");
						break;
					
					} else if ( confirms.equals("n") || confirms.equals("N")) {
					
						System.out.println("삭제가 취소되었습니다.");
						break;
						
					} // 만약 사용자가 n/N 또는 y/Y 말고 다른 문자를 입력한다면, while문의 처음으로 돌아가 다시 물어보는 것을 반복
				
				}
				
			} else if ( select.equals("5") ) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
			} else {
				System.out.println("올바른 번호를 입력하세요.");
			}
			
		}
	}

}

