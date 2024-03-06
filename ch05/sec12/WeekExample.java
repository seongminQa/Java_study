package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {

		Week today = Week.SATURDAY;
		
		if(today == Week.SATURDAY) {
			System.out.println("즐거운 토요일입니다.");
		} else {
			System.out.println("토요일이 아닙니다.");
		}
		
		// 나중에 배울 것 // 클래스, 인스턴스
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK); // 일요일부터 1로 시작
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);
		System.out.println(week);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
		
		switch(week) {
		case 1: 
			today = Week.SUNDAY; 
			break;
		case 2: 
			today = Week.MONDAY; 
			break;
		case 3: 
			today = Week.TUESDAY; 
			break;
		case 4: 
			today = Week.WEDNESDAY; 
			break;
		case 5: 
			today = Week.THURSDAY; 
			break;
		case 6: 
			today = Week.FRIDAY; 
			break;
		case 7: 
			today = Week.SATURDAY; 
			break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 자바 공부를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		
		
	}

}
