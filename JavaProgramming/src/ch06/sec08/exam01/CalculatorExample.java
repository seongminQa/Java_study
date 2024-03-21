package ch06.sec08.exam01;

public class CalculatorExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		
		cal.powerOn();
		
		int result1 = cal.plus(10, 20);
		
		int x = 15;
		int y = 2;
		double result2 = cal.divid(x, y);
		
		System.out.println("10 + 20 = " + result1);
		System.out.println("15 / 2 = " + result2);
		
		cal.powerOff();
		
		
	}

}
