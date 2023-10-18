public class UserClass {

    private String accountNo;
    private String accountName;
    private int balance;

    UserClass(String accountNo, String accountName, int balance){
        this.accountNo = accountNo;
        this.accountName = accountName;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
