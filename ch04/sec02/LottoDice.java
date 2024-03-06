package ch04.sec02;

public class LottoDice {

	public static void main(String[] args) {

		int count = 0;
		
		System.out.println("로또 번호 추천해드리겠습니다!");
		
		while(true) {
			int num = (int) ( Math.random()*45 ) + 1;
			
			System.out.print(num + " ");
			
			count++;
			
			if (count >= 6) {
				System.out.println("\n6숫자 수동으로 해보세요~");
				break;
			}
		}
		
	}

}
