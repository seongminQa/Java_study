package ch02.sec04;

public class FloatDoubleExample {

	public static void main(String[] args) {

		float v1 = 0.1234567890123456789F; // Java는 기본적으로 실수를 double로 간주한다.
		double v2 = 0.1234567890123456789;
		
		System.out.println(v1); // float은 소수점 8자리까지 출력 (마지막에 반올림한다)
		System.out.println(v2); // double은 소수점 16자리까지 출력 (마지막에 반올림한다)
		
		float v3 = 1000000000000F; // float도 int도 4byte인데, float은 어떻게 int보다 큰 수를 변수에 대입할 수 있을까?
		// 수를 표현하는 저장방식이 다르기 때문이다. float은 지수와 가수부분만 저장하기 때문에 훨씬 더 큰 수를 넣을 수 있다.
		double v4 = 10000000000000L;
		double v5 = 10000000000000.0; // 사실상 이렇게 큰 숫자를 다룰 경우가 극히 드물다
	}

}
