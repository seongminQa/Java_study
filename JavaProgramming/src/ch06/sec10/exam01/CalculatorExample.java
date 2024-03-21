package ch06.sec10.exam01;

public class CalculatorExample {

	public static void main(String[] args) {

		double circleArea = 10 * 10 * Calculator.pi;
		int plusResult = Calculator.plus(10, 5);
		
		System.out.println(circleArea);
		System.out.println(plusResult);
	}

}
