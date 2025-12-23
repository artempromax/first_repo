package src.model;

public abstract class Food {
    protected int amount;        // кг
    protected double price;      // цена за кг
    protected boolean isVegetarian;

    protected Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }
}
