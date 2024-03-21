package ch06.sec11.exam01;

public class KoreanExample {

	public static void main(String[] args) {

		// 객체 생성시 생성자를 이용하여 주민등록번호와 이름을 초기화
		Korean k1 = new Korean("123456-1234567", "감자바");
		
		// 출력으로 확인
		System.out.println(k1.nation);	
		System.out.println(k1.ssn);
		System.out.println(k1.name);
		
//		k1.nation = "USA";		// 국가는 final. 변경할 수 없는 값
//		k1.ssn = "123-12-1234";	// 주민번호도 생성자 호출 이후로 변경할 수 없는 값이다
		
		k1.name = "남자바";
		
	}

}
