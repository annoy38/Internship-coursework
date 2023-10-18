import java.util.List;

public class BankingServiceClass {

    List<LoanUserClass> users;

    BankingServiceClass(List<LoanUserClass> users){
        this.users = users;
    }

    public int deposit(String accoutNO, int amountMoney){
        for(UserClass u: users){
            if(u.getAccountNo().equals(accoutNO)){
                u.setBalance(amountMoney+u.getBalance());
                return u.getBalance();
            }
        }
        return 0;
    }

    public int withdrow(String accoutNO, int amountMoney){
        for(UserClass u: users){
            if(u.getAccountNo().equals(accoutNO)){
                u.setBalance(u.getBalance()-amountMoney);
                return u.getBalance();
            }
        }
        return 0;
    }

    public void checkBalance(String accoutNO){
        for(LoanUserClass u: users){
            if(u.getAccountNo().equals(accoutNO)){
                System.out.println("Your Account Balance :"+u.getBalance());
                System.out.println("Your Loan Balance :"+u.getLoanBalance());
            }
        }
    }

}
