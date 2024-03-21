package ch02.sec06;

public class TextBlockExample {
	/* 출력
	 {
	 	"id" : "winter",
	 	"name" : "눈송이"
	 }
	*/
	public static void main(String[] args) {

		String str1 = "" + // 보기 편하라고 ""을 넣어준 것.
				"{\n" + 
				"\t\"id\" : \"winter\",\n" +
				"\t\"name\" : \"눈송이\"\n" +
				"}";
		
		System.out.println(str1);
		
		System.out.println("------------------------------");
		
		// 위의 방식이 너무 불편했기 때문에 java-13부터 """ """ 지원
		// 이스케이프 문자를 사용하지 않아도 표현가능하게 되었다.
		String str2 = 
				""" 
				{
					"id" : "winter",
					"name" : "눈송이"
				}
				""";
		
		System.out.println(str2);
	}

}
