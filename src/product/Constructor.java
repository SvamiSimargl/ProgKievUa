package product;

import orders.Box;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Constructor {
    private Box box = new Box();
    private Pizza pizza;

    public Constructor() {
        pizza.setSize(Size.STANDARD);
        pizza.setName("Basic" +  pizza.getSize() + " pizza with: ");
        pizza.setWeight(300.0);
        pizza.setPrice(100);
    }

    public void addIngridients(Ingredients ingredients) {
        List<Ingredients> ingredientsList = new ArrayList<>(pizza.getIngredients());
        ingredientsList.add(ingredients);
        pizza.setPrice(ingredients.getPrice() + pizza.getPrice());
        pizza.setWeight(ingredients.getWeight() + pizza.getWeight());
        pizza.setDescription(pizza.getName() + " " + pizza.getSize() + " " + ingredients.getName());
    }

    public void dellIngredients(Ingredients ingredients) {
        List<Ingredients> ingredientsList = new ArrayList<>(pizza.getIngredients());
        if (ingredientsList.isEmpty()) {
            throw new IndexOutOfBoundsException("There is no ingredients to delete.");
        } else {
            for (Ingredients ingredients1 : ingredientsList) {
                if (ingredients.getName().equals(ingredients1.getName())) {
                    ingredientsList.remove(ingredients1);
                }

            }
        }

    }

    public void addToBox(Pizza pizza, int quantity) {
        Map<Pizza, Integer> menu = new HashMap<>(box.getPizzaCounter());
        menu.put(pizza,quantity);
        box.setPizzaCounter(menu);
    }
}
