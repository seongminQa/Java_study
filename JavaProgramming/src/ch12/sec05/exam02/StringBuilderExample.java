package ch12.sec05.exam02;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		String data = new StringBuilder()
				.append("DEF")
				.insert(0, "ABC")
				.delete(3, 4)
				.toString();
		
		System.out.println(data);
		
		String data2 = new String("ABC");
		data2 = data2 + "DEF";
		System.out.println(data2);
		String data3 = data2.replace("ABCDEF", "ABCEF");
		System.out.println(data3);
	}

}
