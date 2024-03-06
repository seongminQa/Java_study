package ch03.sec10;

public class AssignmentOperatorExample {

	public static void main(String[] args) {

		int result = 0;
		result += 10;	// result = result + 10; 과 같다.
		// 왼쪽 방법의 경우 연산자가 1개, 오른쪽 방법은 연산자 2개
		// 연산의 속도를 향상시키려면 연산자의 갯수를 줄여야 하지만, 여기서 그렇게 크게 차이가 나지 않는다.
		System.out.println("result = " + result);
		
		result -= 5;
		System.out.println("result = " + result);
		
		result *= 3;
		System.out.println("result = " + result);
		
		result /= 5;
		System.out.println("result = " + result);
		
		result %= 3;
		System.out.println("result = " + result);
		
	}

}
