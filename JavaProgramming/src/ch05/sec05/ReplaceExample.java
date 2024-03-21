package ch05.sec05;

public class ReplaceExample {

	public static void main(String[] args) {

		String subject = "자바 프로그래밍";
		String newStr = subject.replace("자바", "Java");
		System.out.println(newStr);
		
		subject = new String("변경 불가능?");
		System.out.println(subject);
		
		System.out.println();
		
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr2 = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr2);
		
	}

}
