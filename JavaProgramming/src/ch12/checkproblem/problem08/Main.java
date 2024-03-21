package ch12.checkproblem.problem08;

public class Main {

	public static void main(String[] args) {

		double time1 = System.nanoTime();
		
		int[] scores = new int[1000];
		for(int i=0; i<scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for(int score : scores) {
			sum += score;
		}
		
		double avg = sum / scores.length;
		System.out.println(avg);
		
		double time2 = System.nanoTime();
		
		System.out.println((time2-time1));
	}

}
