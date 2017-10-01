package product;

import orders.Box;
import user.User;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Menu {

    private User user = new User();
    private Box box = new Box();


    private List<Pizza> menu;

    public Menu() {
    }

    public Menu(List<Pizza> menu) {
        this.menu = menu;
    }

    public void setMenu(List<Pizza> menu) {
        this.menu = menu;
    }

    public List<Pizza> getMenu() {
        return menu;
    }

    public Pizza findByName(String name) {
        Pizza product = new Pizza();
        for (Pizza pizza : menu) {
            if (name.equals(pizza.getName())) {
                product = pizza;
            }
        }
        return product;
    }

    public void addToBox(Pizza pizza, int quantity) {
        Map<Pizza, Integer> menu = new HashMap<>(box.getPizzaCounter());
       menu.put(pizza,quantity);
       box.setPizzaCounter(menu);
    }

    public void createNewPizza() {
        Constructor constructor = new Constructor();
    }




}
