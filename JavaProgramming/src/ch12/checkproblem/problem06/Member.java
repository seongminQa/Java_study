package ch12.checkproblem.problem06;

public class Member {
	
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// 여기 작성
	@Override
	public String toString() {
		return id + ": " + name;
	}
	
}
