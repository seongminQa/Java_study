package exam.quiz20;

import java.util.Scanner;


public class BankApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = Bank.getInstance(); // Bank 싱글톤 인스턴스를 사용

        String option = "";
        while (!option.equals("6")) {
            System.out.println("---------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.계좌삭제|6.종료");
            System.out.println("---------------");
            System.out.print("선택> ");
            option = sc.nextLine();
            String accountNum = "";
            switch (option) {
                case "1":
                    System.out.println("---------------");
                    System.out.println("계좌 생성");
                    System.out.println("---------------");
                    // 싱글톤을 위한 Bank 클래스로 인해 삭제가 됨
                    // System.out.print("계좌번호: ");
                    // accountNum = sc.nextLine();
                    System.out.print("계좌주: ");
                    String name = sc.nextLine();
                    System.out.print("초기입금액: ");
                    String initialDeposit = sc.nextLine();

                    if (!isValidNumber(initialDeposit)) {
                        System.out.println("유효하지 않은 금액입니다.");
                        break;
                    }

                    boolean created = bank.createAccount(name, Integer.parseInt(initialDeposit));  // accountNum,name,Integer.parseInt(initialDeposit) -> 변경
                    if (created) {
                        System.out.println("계좌가 성공적으로 생성되었습니다.");
                    } else {
                        System.out.println("계좌 생성에 실패했습니다. 계좌 번호가 중복되거나 최대 계좌 수에 도달했을 수 있습니다.");
                    }
                    break;
                case "2":

                    System.out.println("---------------");
                    System.out.println("계좌 목록 (1.내림차순 | 2.오름차순)");
                    System.out.println("---------------");
                    System.out.print("선택>");
                    String order = sc.nextLine();

                    System.out.printf("%-3s %-10s %-10s %-10s %-10s\n", " ", "계좌번호", "예금주", "잔고", "생성일");

                    bank.printAccounts(order);
                    System.out.println();
                    break;
                case "3":
                    System.out.println("---------------");
                    System.out.println("예금");
                    System.out.println("---------------");
                    System.out.print("계좌번호: ");
                    accountNum = sc.nextLine();
                    System.out.print("예금액: ");
                    String depositAmount = sc.nextLine();

                    if (!isValidNumber(depositAmount)) {
                        System.out.println("유효하지 않은 금액입니다.");
                        break;
                    }

                    boolean deposited = bank.depositToAccount(accountNum, Integer.parseInt(depositAmount));
                    if (deposited) {
                        System.out.println();
                    } else {
                        System.out.println("입금 실패. 유효한 계좌번호를 입력해주세요.");
                    }
                    break;
                case "4":
                    System.out.println("---------------");
                    System.out.println("출금");
                    System.out.println("---------------");
                    System.out.print("계좌번호: ");
                    accountNum = sc.nextLine();
                    System.out.print("출금액: ");
                    String withdrawAmount = sc.nextLine();

                    if (!isValidNumber(withdrawAmount)) {
                        System.out.println("유효하지 않은 금액입니다.");
                        break;
                    }

                    boolean withdrawn = bank.withdrawFromAccount(accountNum, Integer.parseInt(withdrawAmount));
                    if (withdrawn) {
                        System.out.println();
                    } else {
                        System.out.println("출금 실패. 유효한 계좌번호를 입력하거나 출금액이 계좌 잔액을 초과하지 않는지 확인해주세요.");
                    }
                    break;
                case "5":
                    System.out.println("---------------");
                    System.out.println("계좌닫기");
                    System.out.println("---------------");
                    System.out.print("계좌번호: ");
                    accountNum = sc.nextLine();
                    boolean close = bank.closeAccount(accountNum);
                    if (close) {
                        System.out.println();
                    } else {
                        System.out.println("계좌 정보가 일치하지 않습니다. 정보를 다시 확인해주세요.");
                    }
                    break;
                case "6":
                    System.out.println("프로그램 종료");
                    break;
                default:
                    System.out.println("\n잘못된 옵션입니다. 다시 입력해주세요\n");
            }
        }
        sc.close();
    }

    // 유저로부터 입력받음 값이 숫자인지 아닌지 판별하는 정적 메소드
    static boolean isValidNumber(String number) {
        // 빈 문자열이나 null인 경우는 유효한 숫자가 아님
        if (number == null || number.length() == 0) {
            return false;
        }
        // 숫자가 아닌 입력값은 false
        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        // 모든 검사를 통과했으면 true 반환
        return true;
    }
}
