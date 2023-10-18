import java.util.List;

public class LoanAndInterestServiceClass extends BankingServiceClass{

    LoanAndInterestServiceClass(List<LoanUserClass> users) {
        super(users);
    }

    public double calculateInterest(String loanT, int loanDuration){
        switch (loanT){
            case "Home":
                return (((5.50*50000)/100)+50000)*loanDuration;
            case "Car":
                return (((2.30*30000)/100)+30000)*loanDuration;
            case "Property":
                return (((4.80*45000)/100)+45000)*loanDuration;
            case "Education":
                return (((1.50*10000)/100)+10000)*loanDuration;
            case "Business":
                return (((10.6*80000)/100)+80000)*loanDuration;
        }
        return 0;
    }

    public double addLoan(String accountNo, String loanType, int loanDuration){
        for(LoanUserClass id: users){
            if(id.getAccountNo().equals(accountNo)){
                id.setLoanType(loanType);
                id.setLoanBalance(calculateInterest(loanType, loanDuration));
                return id.getLoanBalance();
            }
        }
        return 0;
    }

    public double loanRepayment(String accountNo, int amount){
        for(LoanUserClass user: users){
            if(user.getAccountNo().equals(accountNo)){
                user.setLoanBalance(user.getLoanBalance()-amount);
                return user.getLoanBalance();
            }
        }
        return 0;
    }

}
