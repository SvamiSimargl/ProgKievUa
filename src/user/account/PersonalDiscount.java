package user.account;

import orders.Order;
import user.User;

import java.util.ArrayList;
import java.util.List;

public class PersonalDiscount implements Discount {


    private long calculatePersonalDiscount() {
        long personalDiscount = 0;
        User user = new User();
        List<Order> orders = new ArrayList<>(user.getOrderList());
        for (Order o : orders) {
            if (o.getOrderPrice() >= 1000 && o.getOrderPrice() < 2000) {
                personalDiscount = 5;
            } else if (o.getOrderPrice() >= 2000 && o.getOrderPrice() < 3000) {
                personalDiscount = 10;
            } else if (o.getOrderPrice() >= 3000 && o.getOrderPrice() < 4000) {
                personalDiscount = 15;
            } else if (o.getOrderPrice() >= 5000) {
                personalDiscount = 20;

            }

        }
        return personalDiscount;
    }


    @Override
    public long getDiscount() {
        return calculatePersonalDiscount();
    }
}
