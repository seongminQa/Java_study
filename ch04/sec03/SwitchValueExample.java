package ch04.sec03;

public class SwitchValueExample {

	public static void main(String[] args) {

		String grade = "B";
		
		// Java 11 이전 문법
		int score1 = 0;
		switch(grade)
		{
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20; // 이러한 연산식이 들어갈 수 있다는 걸 보여주기위해 쓴 것.
				score1 = result;
				break;
			default:
				score1 = 60;
		}
		
		
		// Java 13부터 가능
		int score2 = switch(grade)
				{
					case "A" -> 100;
					case "B" -> {
						int result = 100 - 20;
						yield result;
					}
					default -> 60;
				};
				
		System.out.println(score2);
		
	}

}
