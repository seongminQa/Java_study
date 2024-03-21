package ch14.sec06.exam01;

public class Calculator {
	// Field
	private int memory;
	
	
	// Constructor
	
	
	
	// Method
	public int getMemory() {
		return memory;
	}
	
	public void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
}
