package ch06.sec07.exam03;

public class KoreanExample {

	public static void main(String[] args) {

		// 객체 생성과 초기화
		Korean k1 = new Korean("박자바", "971212-1066892");
		
		// 객체의 데이터 읽기
		System.out.println("국적 : " + k1.nation);
		System.out.println("이름 : " + k1.name);
		System.out.println("주민번호 : " + k1.ssn);
		System.out.println();
		
		// 또 다른 객체 생성
		Korean k2 = new Korean("한자바", "951014-2088686");
		
		// 객체의 데이터 읽기
		System.out.println("국적 : " + k2.nation);
		System.out.println("이름 : " + k2.name);
		System.out.println("주민번호 : " + k2.ssn);
		
	}

}
