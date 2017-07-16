package recipe.domain;

import org.springframework.data.annotation.Id;

public class Quantity {

    private float quantity;
    private String unit;

    public Quantity() {
    }

    public Quantity(float quantity, String unit) {
        this.quantity = quantity;
        this.unit = unit;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
