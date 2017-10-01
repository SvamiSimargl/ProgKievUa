package user;

import java.util.ArrayList;
import java.util.List;

public class Users {
    private List<User> users = new ArrayList<>();

    void addUserToBase(User user){
       users.add(user);
   }
}
