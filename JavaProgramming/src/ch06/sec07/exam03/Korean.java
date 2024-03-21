package ch06.sec07.exam03;

public class Korean {
	
	// 필드 선언
	String nation = "대한민국";
	String name;
	String ssn;
	
	/*Korean(String n, String s){
		name = n;
		ssn = s;
	}*/
	
	// 가독성이 좋게 생성자를 다시 선언!!
	Korean(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	
}
