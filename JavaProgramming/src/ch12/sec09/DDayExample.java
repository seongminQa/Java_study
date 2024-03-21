package ch12.sec09;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DDayExample {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime chrismas = LocalDateTime.of(now.getYear(), 12, 25, 0, 0, 0);
		
		long dday = now.until(chrismas, ChronoUnit.DAYS);
		System.out.println("현재로부터 크리스마스까지 남은 일 수: " + dday);
		
		
	}

}
