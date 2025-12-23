import model.Apple;
import model.Meat;
import model.Food;
import model.constants.Colour;
import service.ShoppingCart;

public class Main {

    public static void main(String[] args) {

        Food meat = new Meat(5, 100);
        Food redApples = new Apple(10, 50, Colour.RED);
        Food greenApples = new Apple(8, 60, Colour.GREEN);

        Food[] foods = { meat, redApples, greenApples };

        ShoppingCart cart = new ShoppingCart(foods);

        System.out.println("Общая сумма товаров без скидки: "
                + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: "
                + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: "
                + cart.getVegetarianTotalPrice());
    }
}
