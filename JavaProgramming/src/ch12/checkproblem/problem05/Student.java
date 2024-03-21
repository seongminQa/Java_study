package ch12.checkproblem.problem05;

import lombok.EqualsAndHashCode;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}
	
	// 여기에 작성
	@Override
	public int hashCode() {
		int hashCode = studentNum.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		return studentNum.equals(obj);
	}
}
