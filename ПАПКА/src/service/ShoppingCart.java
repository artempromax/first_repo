package src.service;

import src.model.Food;
import src.model.Discountable;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] foods) {
        this.foods = foods;
    }

    public double getTotalPriceWithoutDiscount() {
        double sum = 0;
        for (Food food : foods) {
            sum += food.getAmount() * food.getPrice();
        }
        return sum;
    }

    public double getTotalPriceWithDiscount() {
        double sum = 0;
        for (Food food : foods) {
            double price = food.getAmount() * food.getPrice();

            if (food instanceof Discountable) {
                double discount = ((Discountable) food).getDiscount();
                price -= price * discount / 100;
            }

            sum += price;
        }
        return sum;
    }

    public double getVegetarianTotalPrice() {
        double sum = 0;
        for (Food food : foods) {
            if (food.isVegetarian()) {
                sum += food.getAmount() * food.getPrice();
            }
        }
        return sum;
    }
}