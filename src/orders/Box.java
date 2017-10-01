package orders;

import product.Pizza;
import user.User;
import user.account.PaymentType;
import user.account.Discount;
import user.account.PersonalDiscount;
import user.account.StockDiscount;

import java.time.LocalDateTime;
import java.util.*;

public class Box {
    private Discount personalDiscount = new PersonalDiscount();
    private Discount stockDiscount = new StockDiscount();
    private Order order = new Order();
    private User user = new User();
    private Map<Pizza, Integer> pizzaCounter;


    public Box() {
    }


    public Box(Map<Pizza, Integer> pizzaCounter) {

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPizzaCounter(Map<Pizza, Integer> pizzaCounter) {
        this.pizzaCounter = pizzaCounter;
    }

    public Map<Pizza, Integer> getPizzaCounter() {
        return pizzaCounter;
    }


    public void addCount(String name) {
        Map<Pizza, Integer> menu = new HashMap<>(this.pizzaCounter);
        for (Map.Entry<Pizza, Integer> pair : menu.entrySet()) {
            if (pair.getKey().getName().equals(name)) {
                pair.setValue(pair.getValue() + 1);
            }
        }
        this.pizzaCounter = menu;

    }

    public void dellCount(String name) {
        Map<Pizza, Integer> menu = new HashMap<>(this.pizzaCounter);
        for (Map.Entry<Pizza, Integer> pair : menu.entrySet()) {
            if (pair.getKey().getName().equals(name)) {
                pair.setValue(pair.getValue() - 1);
            }
            if (pair.getValue().equals(0)) {
                menu.remove(pair.getKey());
            }
        }
        this.pizzaCounter = menu;

    }

    public long orderPrice() {
        long price = 0;
        Map<Pizza, Integer> menu = new HashMap<>(this.pizzaCounter);
        for (Map.Entry<Pizza, Integer> pair : menu.entrySet()) {
            price += pair.getKey().getPrice();
        }
        return (price - personalDiscount.getDiscount() / 100 * price) - stockDiscount.getDiscount();
    }


    public void createOrder(String name, String phone, String address, String eMail) {
        List<Order> orders = new ArrayList<>(user.getOrderList());
        order.setName(name);
        order.setPhoneNumber(phone);
        order.setAddress(address);
        order.seteMail(eMail);
        order.setId(UUID.randomUUID().toString());
        order.setCreatedDate(LocalDateTime.now());
        orders.add(order);
        user.setOrderList(orders);

    }

    public void pay(PaymentType paymentType) {
        System.out.println("Please,choose type of payment.");
        PaymentType current = paymentType;
        if (current == PaymentType.CASH) {
            System.out.println("Your order price will be without commission = " + orderPrice());
        } else if (current == PaymentType.MASTERCARD) {
            System.out.println("Your order price will be with commission 1% = " + orderPrice() / 100 + orderPrice());
        } else if (current == PaymentType.VISA) {
            System.out.println("Your order price will be with commission 2% = " + orderPrice() / 100 * 2 + orderPrice());
        }
    }

}
