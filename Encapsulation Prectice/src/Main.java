import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserClass user1 = new UserClass("Abir", "258");
        UserClass user2 = new UserClass("Fahim", "369");
        UserClass user3 = new UserClass("Salam", "147");
        UserClass user4 = new UserClass("Rubel", "456");
        UserClass user5 = new UserClass("Annoy", "2938");

        List<UserClass> user = new ArrayList<>();
        user.add(user1);
        user.add(user2);
        user.add(user3);
        user.add(user4);
        user.add(user5);
        LoginClass loginClass = new LoginClass(user);
        System.out.println(loginClass.checkUser("Annoy", "2938"));
        System.out.println(loginClass.addUser("Riaz", "2930"));
    }
}