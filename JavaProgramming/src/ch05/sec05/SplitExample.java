package ch05.sec05;

public class SplitExample {

	public static void main(String[] args) {
		
		String test = "번호,제목,내용,성명";
		String[] arr = test.split(",");
		
		for(int i=0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		String board = "1,자바 학습,참조 타입 String을 학습합니다.,홍길동";
		String[] tokens = board.split(",");
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}

	}

}
