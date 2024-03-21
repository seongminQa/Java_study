package exam.quiz20;

public class Bank {
    private final int ACCOUNTS_LIMIT = 100;
    private static Bank instance = new Bank();
    private Account[] accounts;
    private int count = 0;

    private Bank() {
        accounts = new Account[ACCOUNTS_LIMIT];
    }

    public static Bank getInstance() {
        return instance;
    }

    // 계좌 생성 메소드
    public boolean createAccount(String name, int initialDeposit) {

        int index = emptyAccountNum();
        String accountNum;
        if (index == -1) {
            return false; // 계좌 생성 실패: 더 이상 계좌를 생성할 수 없는 경우
        }

        //do-while 문 특징을 이용해서 무조건 계좌번호 생성메소드 실행하고
        // 번호가 중복된다면 루프를 나올수없음
        do {
            // 랜덤한 계좌번호 생성
            accountNum = generateRandomAccountNum();
        } while (findIndexNum(accountNum) != -1); // 생성된 계좌번호가 중복되지 않을 때까지 반복

        accounts[index] = new Account();
        accounts[index].setId(count);
        accounts[index].setAccountNum(accountNum);
        accounts[index].setName(name);
        accounts[index].setBalance(String.valueOf(initialDeposit));
        accounts[index].setDate();
        count++;
        return true; // 계좌 생성 성공
    }

    // 랜덤한 계좌번호를 생성하는 메소드
    private String generateRandomAccountNum() {
        // 자리수를 6자리로 한다고 가정했을때 랜덤 계좌번호 생성
        int number = (int) (Math.random() * 1000000); //자리수를 변경하기 위해서는 맨뒤의 숫자의 0 개수를 늘려줘야함
        return String.format("%06d", number); // 6자리로 맞추기 위해 앞을 0으로 채움
    }

    // 계좌 목록 출력 메소드 - ID를 기준으로 버블 정렬 사용
    public void printAccounts(String option) {
        // 계좌 배열 복사 (실제 배열은 변경하지 않음)
        Account[] sortedAccounts = new Account[accounts.length];
        System.arraycopy(accounts, 0, sortedAccounts, 0, accounts.length);

        // 버블 정렬 로직
        for (int i = 0; i < sortedAccounts.length - 1; i++) {
            for (int j = 0; j < sortedAccounts.length - i - 1; j++) {
                if (sortedAccounts[j] == null || sortedAccounts[j + 1] == null) {
                    continue; // null 값 비교 방지
                }
                boolean swapCondition = option.equals("1") ?
                        sortedAccounts[j].getId() > sortedAccounts[j + 1].getId() :
                        sortedAccounts[j].getId() < sortedAccounts[j + 1].getId();
                if (swapCondition) {
                    // 값 교환
                    Account temp = sortedAccounts[j];
                    sortedAccounts[j] = sortedAccounts[j + 1];
                    sortedAccounts[j + 1] = temp;
                }
            }
        }

        // 정렬된 계좌 배열 출력
        for (Account account : sortedAccounts) {
            if (account != null) {
                printAccountDetails(account);
            }
        }
    }


    private void printAccountDetails(Account account) {
        String formattedAccountNum = formatAccountNum(account.getAccountNum());
        System.out.printf("%-3s%-10s %-10s %-10d %-10s\n",account.getId()+1, formattedAccountNum, account.getName(), account.getBalance(), account.getDate());
    }


    // 계좌번호를 "xxx-xxx" 형식으로 변환하는 메소드
    private String formatAccountNum(String accountNum) {
        return accountNum.substring(0, 3) + "-" + accountNum.substring(3);
    }

    // 예금 메소드
    public boolean depositToAccount(String accountNum, int amount) {
        // 하이픈을 있다면 제거한 계좌번호를 사용
        String modifiedAccountNum = removeHyphen(accountNum);
        int index = findIndexNum(modifiedAccountNum);

        if (index != -1) {
            System.out.println(accounts[index].deposit(String.valueOf(amount)));
            return true; // 예금 성공
        }
        return false; // 예금 실패
    }

    // 출금 메소드
    public boolean withdrawFromAccount(String accountNum, int amount) {
        // 하이픈을 있다면 제거한 계좌번호를 사용
        String modifiedAccountNum = removeHyphen(accountNum);
        int index = findIndexNum(modifiedAccountNum);

        if (index != -1 && accounts[index].getBalance() >= amount) {
            System.out.println(accounts[index].withdraw(String.valueOf(amount)));
            return true; // 출금 성공
        }
        return false; // 출금 실패
    }

    //삭제 메소드
    public boolean closeAccount(String accountNum) {
        String modifiedAccountNum = removeHyphen(accountNum);
        int index = findIndexNum(modifiedAccountNum);
        if (index == -1) {
            return false;
        }
        //데이터 Null값으로 설정 = 삭제
        accounts[index] = null;
        System.out.println("계좌를 닫았습니다.");
        return true;
    }

    // 빈 계좌 번호 인덱스 찾기 메소드
    private int emptyAccountNum() {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                return i;
            }
        }
        return -1;
    }

    // 계좌 번호로 계좌 찾기 메소드
    private int findIndexNum(String accountNum) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null && accounts[i].getAccountNum().equals(accountNum)) {
                return i;
            }
        }
        return -1;
    }

    //유저가 계좌번호 입력시 하이픈을 입력할수 있다는 것을 확인
    //혹시나 유저가 계좌번호 입력시 "-"을 입력한다면 제거, "-"가 없어도 replace가 찾지못하기 때문에 계좌번호가 변경되지 않음
    private String removeHyphen(String accountNum) {
        return accountNum.replace("-", "");
    }


}
