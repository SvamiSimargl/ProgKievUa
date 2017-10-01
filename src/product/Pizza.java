package product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<Ingredients> ingredients = new ArrayList<>();
    private String name;
    private Size size;
    private double weight;
    private String description;
    private long price;

    public Pizza() {
    }

    public Pizza(String name, String size, double weight, String description, long price) {

        this.name = name;

        this.weight = weight;
        this.description = description;
        this.price = price;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(long price) {
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String getDescription() {
        return description;
    }

    public long getPrice() {
        return price;
    }

    public List<Ingredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredients> ingredients) {
        this.ingredients = ingredients;
    }
}
