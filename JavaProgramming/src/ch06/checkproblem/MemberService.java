package ch06.checkproblem;

public class MemberService {

	// 확인문제 15번
	// 필드 선언.
	String name;
	String id;
	String password;
	int age;

	// 생성자 선언
	MemberService() {
	}

	// 메소드 선언
	boolean login(String id, String password) {
		/*if ((this.id == id) && (this.password == password)) {
			return true;
		}*/
		if (("hong" == id) && ("12345" == password)) {
			return true;
		}
		return false;
	}

	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
}
