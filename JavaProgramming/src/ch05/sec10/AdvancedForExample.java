package ch05.sec10;

public class AdvancedForExample {

	public static void main(String[] args) {

		// 배열을 이용한 for문을 사용해보자.
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		for(int score : scores) {
			System.out.println(score);
			sum += score;
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
		
	}

}
