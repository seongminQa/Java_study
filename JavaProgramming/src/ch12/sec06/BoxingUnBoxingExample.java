package ch12.sec06;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// Boxing ( 기본 타입의 리터럴을 객체로 만드는 것 )
		Integer obj = 100;
		System.out.println(obj);	// 자동 언박싱 되는 구문이 아님. 언박싱이 되려면 다른 정수와 연산이 일어나야한다.
		System.out.println(obj.toString());		// 위의 구문과 같다는 것이다.
		System.out.println(obj + "입니다.");		// 여기에서 obj는 "100"을 리턴한다. obj.toString()과 같다는 것.
		System.out.println(100 + "입니다.");
		String str = obj + "입니다.";				// 확인해보기
		System.out.println("str : " + str);
		
		System.out.println(obj.intValue()+5);
		System.out.println("value: " + obj.intValue());		// 언박싱하여 값을 보여주는 것
		
		// Unboxing ( 기본 타입 객체 내부의 값을 다시 기본 타입으로 변환)
		int value = obj;
		System.out.println("value: " + value);
		
		// 연산 시 Unboxing
		int result = obj + 100;
		System.out.println(result);
	}

}
