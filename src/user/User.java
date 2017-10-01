package user;

import orders.Order;
import user.account.PersonalDiscount;

import java.util.*;


public class User {


    private String id = "";
    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;
    private String login;
    private String password;

    private Map<String, String> logPass;
    private List<Order> orderList = new ArrayList<>();



    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void createNewUser(String name, String address, String phoneNumber, String eMail, String login, String password) {
        User user = new User();
        user.name = name;
        user.address = address;
        user.phoneNumber = phoneNumber;
        user.eMail = eMail;
        user.login = login;
        user.password = password;
        user.id = UUID.randomUUID().toString();
        Users users = new Users();
        users.addUserToBase(user);

    }

    public void showDiscount() {
        PersonalDiscount personalDiscount = new PersonalDiscount();
        System.out.println("Your current personal discount = " + personalDiscount.getDiscount());
    }

    public void showOrderHistory() {
        List<Order> orderList = new ArrayList<>(this.orderList);
        for (Order order : orderList) {
            System.out.println(order.toString());
        }

    }

    public boolean logIn(String login, String password) {
        boolean isTrue = false;
        Map<String, String> logPass = new HashMap<>(this.logPass);
        for (Map.Entry<String, String> pair : logPass.entrySet()) {
            if (login.equals(pair.getKey()) && password.equals(pair.getValue())) {
                isTrue = true;
            } else {
                isTrue = false;
            }

        }
        return isTrue;
    }


    public void logOut() {
        //TODO реализовывается с GUI
    }

}
