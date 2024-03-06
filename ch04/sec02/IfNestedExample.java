package ch04.sec02;

public class IfNestedExample {

	public static void main(String[] args) {

		// 81점 이상의 점수만 나오는 score
		// 그것을 이용한 학점 등급 계산 프로그램
		int score = (int) (Math.random() * 20) + 81;
		System.out.println("score = " + score);
		
		String grade;
		
		if(score >= 90) 
		{
			if(score >= 95) {
				grade = "A+";
			} 
			else {
				grade = "A";
			}
		} 
		else 
		{
			if(score >= 85) {
				grade = "B+";
			} 
			else {
				grade = "B";
			}
		}
		
		System.out.println("학점 = " + grade);
		
	}

}
