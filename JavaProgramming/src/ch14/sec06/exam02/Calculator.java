package ch14.sec06.exam02;

public class Calculator {
	// Field
	private int memory;
	
	
	// Constructor
	
	
	
	// Method
	public int getMemory() {
		return memory;
	}
	
	public synchronized void setMemory(int memory) {  // setMemory는 동기화 사용
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}
	
	public synchronized void setMemory2(int memory) { 
		// 다른 필요한 코드가 있을 때 ...
		//
		//
		synchronized(this) {
			this.memory = memory;
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName() + ": " + this.memory);			
		}
		
		// 다른 필요한 코드가 있을 때 ...
		//
		//
	}
}
