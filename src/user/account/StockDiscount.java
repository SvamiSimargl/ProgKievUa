package user.account;

import orders.Box;
import product.Pizza;

import java.util.HashMap;
import java.util.Map;

public class StockDiscount implements Discount {
    private long specialOffer = 50;

    @Override
    public long getDiscount() {
        long specialOffer = 0;
        Box box = new Box();
        Map<Pizza, Integer> pizzaInTheBox = new HashMap<>(box.getPizzaCounter());
        for (Map.Entry<Pizza, Integer> pair : pizzaInTheBox.entrySet()) {
            if (pair.getKey().getName().equals("Неаполитана") && (pair.getKey().getName().equals("Дьявола"))) {
                specialOffer = this.specialOffer;
            }

        }


        return specialOffer;
    }
}
