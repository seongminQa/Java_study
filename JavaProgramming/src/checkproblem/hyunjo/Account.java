package ch06.practice.exam20;

import java.util.*;

public class Account {
	// Field
	String accountNum;

	String name;

	int balance;

	BankApplication instance = BankApplication.getBankApplication();

	// Constructor

	// 계좌 생성
	public boolean createAccount(String accountNum, String name, String balance) {
		this.accountNum = accountNum;
		this.name = name;
		this.balance = Integer.parseInt(balance);

		String[] accountArr = new String[3];

		accountArr[0] = accountNum;
		accountArr[1] = name;
		accountArr[2] = balance;

		boolean result = instance.plusAccountBankApplication(accountArr);

		if (result) {
			return true;
		} else {
			return false;
		}
	}
	
	// 목록 조회
	public String[][] findAllAccount() {
		int totalAccount = instance.totalAccountNum();
		
		// validation(1) - 계좌를 생성한 사용자가 한 명도 없는 경우
		if (totalAccount == 0) {
			return null;
		} else {
			String[][] account = instance.readAccountBankApplication();
			
			return account;
		}
	}
	

	// 예금
	public boolean deposit(String accountNum, String money) {
		String[] account = instance.findAccount(accountNum);

		// validation(1) - 일치하는 사용자가 존재하지 않는 경우
		if (account == null) {
			return false;
		}
		
		int temp = Integer.parseInt(account[2]);
		int inputMoney = Integer.parseInt(money);
		temp += inputMoney;

		account[2] = String.valueOf(temp); // deposit success
		
		return true;
	}

	// 출금
	public boolean withdraw(String accountNum, String money) {
		String[] account = instance.findAccount(accountNum);
		int inputMoney = Integer.parseInt(money);
		

		// validation(1) - 일치하는 사용자가 존재하지 않는 경우
		if (account == null) {
			System.out.println("▶ 일치하는 계좌번호의 사용자가 존재하지 않습니다. 다시 입력해주세요.\n");
			return false;
		}

		// validation(2)  - 잔액보다 출금액이 더 큰 경우
		int currentBalance = Integer.parseInt(account[2]);
		if (currentBalance < inputMoney) {
			System.out.println("▶ 잔액보다 출금하려고 하는 금액이 더 큽니다. 출금할 수 없습니다.\n");
			return false;
		}
		
		currentBalance -= inputMoney;

		account[2] = String.valueOf(currentBalance); // withdraw success
		return true;
	}

	// Method

}
