package ch06.practice.exam20;

import java.util.*;

// 싱글톤
public class BankApplication {
	// Field
	private static BankApplication instance = new BankApplication();
	
	private static String[][] account = new String[100][];
	
	// Constructor
	private BankApplication() {
		
	}
	
	
	// Method
	public static BankApplication getBankApplication() {
		return instance;
	}
	
	// 계좌 전체 이용 수 
	public int totalAccountNum() {
		int total = 0;
		
		for (int i = 0; i < account.length; i++) {
			if (account[i] != null) {
				total++;
			} else if (account[i] == null) {
				return total;
			}
		}
		return total;
	}
	
	// 계좌번호에 해당하는 계좌 조회하기
	public String[] findAccount(String accountNum) {
		String[] account = new String[3];
		
		for (int i = 0; i < totalAccountNum(); i++) {
			String[] temp = BankApplication.account[i];
			
			if (temp[0].equals(accountNum)) {
				return temp;
			} 
		}
		return null;
	}
	
	
	// 계좌 생성 -> 계좌어플리케이션에 배열 추가 +1 
	public boolean plusAccountBankApplication(String[] account) {
	
		int idx =totalAccountNum();
		
		BankApplication.account[idx] = account;
		
//		System.out.println(Arrays.toString(BankApplication.account[idx]));
		
		if (totalAccountNum() >= 100) {
			return false;
		}	
		return true;
	}
	
	// 계좌 목록
	public String[][] readAccountBankApplication() {
		return BankApplication.account;
	}
	
}
