package ch06.sec08.exam02;

public class CallByValueVsCallByReference {

	public static void main(String[] args) {
		
		// 면접 질문 ! 중요 !!
		
		int value1 = 1;		// 기본타입
		int[] value2 = {1};	// 참조타입
		
		callByValue(value1);
		System.out.println("value1 = " + value1);
		
		callByReference(value2);
		System.out.println("value2[0] = " + value2[0]);
		
		// 참조 확인하기
		// 이해하기
		// String은 예외?
		Member member = new Member("홍길동");
		System.out.println("name: " + member.name);
		callByReference(member);
		System.out.println("name: " + member.name);
		
		
	}
	
	
	public static void callByValue(int arg) {
		arg = 2;
	}
	
	public static void callByReference(int[] arg) {
		arg[0] = 2;
	}

	public static void callByReference(Member arg) {
		arg.name = "감자바";
		
	}
}
