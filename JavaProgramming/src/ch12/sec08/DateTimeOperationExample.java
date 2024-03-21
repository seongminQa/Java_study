package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd a "
				+ "HH:mm:ss");
		
		System.out.println("현재 시간: " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1);
		System.out.println("1년 덧셈: " + result1.format(dtf));
		
		LocalDateTime result2 = now.plusYears(2);
		System.out.println("2년 덧셈: " + result2.format(dtf));
		
		LocalDateTime result3 = now.plusYears(7);
		System.out.println("7년 덧셈: " + result3.format(dtf));
		
	}

}
