import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        ArrayList<PaymentClass> paymentList = new ArrayList<>();
        paymentList.add(new PaymentClass(
                1011231053,
                "Shahriar Hayder",
                "shahahriarhayder47@gmail.com",
                "Male",
                4,
                new ArrayList<>(List.of("Peanut Butter", "Mobile Cover", "Book", "Fruit")),
                1200));

        paymentList.add(new PaymentClass(
                1011231054,
                "Satoru Gojo",
                "satorugojo38@gmail.com",
                "Male",
                3,
                new ArrayList<>(List.of("Mobile", "Computer", "Headphone")),
                1000));

        paymentList.add(new PaymentClass(
                1011231055,
                "Suguru Geto",
                "sugurugeto98@gmail.com",
                "Male",
                4,
                new ArrayList<>(List.of("Book", "Ring")),
                700));

        paymentList.add(new PaymentClass(
                1011231057,
                "Yuji Itadori",
                "itadori458@gmail.com",
                "Male",
                7,
                new ArrayList<>(List.of("Game", "Chocolate", "Ring", "Shirt", "Pant", "Sneaker")),
                2000));

        paymentList.add(new PaymentClass(
                1011231216,
                "Nubara",
                "nubara523@gmail.com",
                "Female",
                1,
                new ArrayList<>(List.of("Lipstick")),
                800));

        int moreThan1000TakaMarketUsers = (int) paymentList.
                stream()
                .filter(s->s.getTotalBill()>=1000)
                .count();

        System.out.println("How many users Market More than 1000 taka: "+moreThan1000TakaMarketUsers);

        int numberOfBookBuyer = (int) paymentList
                .stream()
                .filter(s->
                     s.getItemList().contains("Ring"))
                .count();
        System.out.println("How many User Buy Book: "+numberOfBookBuyer);

        int whoBuyMoreThan4Item = (int) paymentList
                .stream()
                .filter(s->
                        s.getItemQuantity()>=4)
                .count();
        System.out.println("How many User Buy more than 4 item: "+whoBuyMoreThan4Item);

        int numberOfMaleUser = (int) paymentList
                .stream()
                .filter(s->
                        s.getGender().contains("Male"))
                .count();

        int numberOfFemaleUser = (int) paymentList
                .stream()
                .filter(s->
                        s.getGender().contains("Female"))
                .count();

        System.out.println("Number of Male User: "+numberOfMaleUser);
        System.out.println("Number of Female User: "+numberOfFemaleUser);

        calculateClass calculate = new calculateClass();
        calculate.get(5,5);

        Ifunction cal = OperationClass :: new;
        System.out.println(cal.get(5,5));
    }
}