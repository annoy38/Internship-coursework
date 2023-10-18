public class LoanUserClass extends UserClass{
    String loanType;
    double loanBalance;

    LoanUserClass(String accountNo, String accountName, int balance) {
        super(accountNo, accountName, balance);
    }

    LoanUserClass(String accountNo, String accountName, int balance, String loanType, double loanBalance) {
        super(accountNo, accountName, balance);
        this.loanType = loanType;
        this.loanBalance = loanBalance;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getLoanBalance() {
        return loanBalance;
    }

    public void setLoanBalance(double loanBalance) {
        this.loanBalance = loanBalance;
    }
}
