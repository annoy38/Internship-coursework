import java.util.List;

public class LoginClass {
    List<UserClass> user;
    LoginClass(List<UserClass> user){
        this.user = user;
    }


    public String checkUser(String uName, String uPassword){
        for(UserClass u: user){
            if(u.getUserName().equals(uName) && u.getUserPassword().equals(uPassword)){
                return "Login Successful";
            }
        }
        return "Invalid User Name and Password";
    }

    public String addUser(String uName, String uPassword){
        user.add(new UserClass(uName, uPassword));
        return "User Add Successfully";
    }
}
