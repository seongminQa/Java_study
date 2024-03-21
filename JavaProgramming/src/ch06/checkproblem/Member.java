package ch06.checkproblem;

public class Member {
	
	// 필드 선언	// 확인문제 13번.
	String name;
	String id;
	String password;
	int age;
	
	// 생성자 선언		// 14번
	Member(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	
	// 메소드 선언
	boolean login(String id, String password) {
		if((this.id == id) && (this.password == password)) {
			return true;
		}
		return false;
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
}
