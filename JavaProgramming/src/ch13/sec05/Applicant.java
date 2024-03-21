package ch13.sec05;

// 신청자 클래스
// Worker, Student, HighStudent, MiddleStudent 등을 받고 싶다.
public class Applicant <T> {
	public T kind;
	
	public Applicant(T kind) {
		this.kind = kind;
	}
}
