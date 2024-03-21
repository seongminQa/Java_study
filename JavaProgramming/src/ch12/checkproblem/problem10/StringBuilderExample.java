package ch12.checkproblem.problem10;

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder str = null;
		for(int i=1; i<=100; i++) {
			str = new StringBuilder().append(i);
		}
		
		System.out.println(str);
	}

}
