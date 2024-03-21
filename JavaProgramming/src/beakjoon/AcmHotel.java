package beakjoon;

import java.util.Scanner;

public class AcmHotel {

	public static void main(String[] args) {

		int n=0; // 손님 수
		int h;
		int w;
		int t;
		int i;

		int count=0;
		int count2=0;
		int[] s = new int[2];
		
		Scanner scan = new Scanner(System.in);
		// 테스트 수 입력받기
		t = Integer.parseInt(scan.nextLine());

		// 문제풀기
		while(t>0) {
			// 층 수, 호 수, 고객 수 입력받기
			String[] num = scan.nextLine().split(" ");
			// next()는 공백이 나오는 순간 끊긴다.
			
			h = Integer.parseInt(num[0]);
			w = Integer.parseInt(num[1]);
			n = Integer.parseInt(num[2]);
			
			for(i=1; i<=w; i++) { // 호 수
				
				for(int j=1; j<=h; j++) { // 층 수
					count++;
					if(count == n) {
						s[count2] = j*100+i;
						count2++;
						t--;
						count = 0;
						i = w+1;
						break;
					}
				}
			}
		}
		for(int k=0; k<s.length; k++) {
			System.out.println(s[k]);
		}
	}
}