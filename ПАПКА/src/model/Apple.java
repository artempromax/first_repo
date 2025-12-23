package src.model;

import src.model.constants.Colour;
import src.model.constants.Discount;

public class Apple extends Food implements Discountable {

    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        this.isVegetarian = true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equalsIgnoreCase(colour)) {
            return Discount.APPLE;
        }
        return 0;
    }
}