package recipe.domain;

public class Ingredient {
    private String name;
    private Quantity quantity;

    public Ingredient() {
    }

    public Ingredient(String name, Quantity quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Quantity getQuantity() {
        return quantity;
    }

    public void setQuantity(Quantity quantity) {
        this.quantity = quantity;
    }
}
