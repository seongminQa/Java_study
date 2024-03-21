package ch12.sec08;

import java.util.Calendar;
import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		
		String[] availableIDs = TimeZone.getAvailableIDs();
		for(String id : availableIDs) {
			System.out.println(id);
		}
		
		TimeZone timeZone = TimeZone.getTimeZone("America/New_York");
		Calendar now = Calendar.getInstance(timeZone);
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour + ":" + minute + ":" + second);
		
	}

}
