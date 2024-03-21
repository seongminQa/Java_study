package ch14.sec06.exam01;

public class User2Thread extends Thread {
	// Field
	private Calculator calculator;
	
	
	// Constructor
	public User2Thread() {
		setName("User2Thread");
	}
	
	
	// Method
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
