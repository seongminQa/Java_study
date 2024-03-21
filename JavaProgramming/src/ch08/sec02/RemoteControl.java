package ch08.sec02;

public interface RemoteControl {
	public void turnOn();
//	public abstract void turnOn(); // 이렇게 사용할 수 있는데, 드물다. 바로 위의 코드처럼만 선언해도
								   // 비슷하게 사용할 수 있기 때문
	public void turnOff();
	
}
