package ch12.sec09;

import java.text.DecimalFormat;

public class DeciamlFormatExample {
	public static void main(String[] args) {
		
		double num = 1234567.89456;
		
		DecimalFormat df;
		
		df = new DecimalFormat("#,###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#,###.00");
		System.out.println(df.format(num));

	}
}
