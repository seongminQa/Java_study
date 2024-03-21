package beakjoon.problem10807;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// 버퍼로 입력을 받는다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// n개의 정수를 입력받는다.
		int n = Integer.parseInt(br.readLine());  // 예외처리 해주어야 함. -> throws
		// 입력받은 수들을 저장할 정수형 배열
		int[] storage = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int checkn = Integer.parseInt(br.readLine());
		for(int i=0; i<n; i++) {
			storage[i] = Integer.parseInt(st.nextToken());
		}
		
		
	}

}
