import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LoanUserClass> loanUser = new ArrayList<>();
        LoanUserClass mukim = new LoanUserClass("193352001", "Mukim", 50000);
        LoanUserClass tanvir = new LoanUserClass("193352912", "Tanvir", 500000);
        LoanUserClass provat = new LoanUserClass("193352914", "Provat", 80000);
        LoanUserClass saidur = new LoanUserClass("193352919", "Saidur", 200000);
        LoanUserClass riaz = new LoanUserClass("193352930", "Riaz", 150000);
        LoanUserClass fahim = new LoanUserClass("193352898", "Fahim", 400000);
        LoanUserClass annoy = new LoanUserClass("193352938", "Annoy", 800000);
        loanUser.add(mukim);
        loanUser.add(tanvir);
        loanUser.add(provat);
        loanUser.add(saidur);
        loanUser.add(riaz);
        loanUser.add(fahim);
        loanUser.add(annoy);

        BankingServiceClass bankingServiceClass = new BankingServiceClass(loanUser);
        System.out.println(bankingServiceClass.deposit("193352898", 20000)+" Your total Balance After Diposit");

        LoanAndInterestServiceClass loanAndInterestServiceClass = new LoanAndInterestServiceClass(loanUser);

        System.out.println("Your Loan Amount "+loanAndInterestServiceClass.calculateInterest("Home", 24));

        System.out.println("Your Total Loan Balance is "+loanAndInterestServiceClass.addLoan("193352898", "Home", 24));
        bankingServiceClass.checkBalance("193352898");
    }
}