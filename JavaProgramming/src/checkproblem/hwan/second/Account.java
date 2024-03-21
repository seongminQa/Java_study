package exam.quiz20;

import java.util.Calendar;

public class Account {
    private int id = 0;
    private String accountNum;
    private String name;
    private int balance;
    private String curDate;

    private String Date;

    public String withdraw(String amount) {
        balance -= Integer.parseInt(amount);
        return "출금이 성공되었습니다.";
    }

    public String deposit(String amount) {
        balance += Integer.parseInt(amount);
        return "입금이 성공되었습니다.";
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(String amount) {
        this.balance = Integer.parseInt(amount);
    }

    public void setDate() {
        Calendar currentDate = Calendar.getInstance();
        int year = currentDate.get(Calendar.YEAR);
        int month = currentDate.get(Calendar.MONTH) + 1;
        int day = currentDate.get(Calendar.DAY_OF_MONTH);
        int hour = currentDate.get(Calendar.HOUR_OF_DAY);
        int min = currentDate.get(Calendar.MINUTE);
        int sec = currentDate.get(Calendar.SECOND);
        curDate = year + "/" + month + "/" + day + "/" + hour + ":" + min + ":" +
                sec;
    }

    public int getId() {
        return id;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String getDate() {
        return curDate;
    }
}
