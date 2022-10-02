import Decorator.ExtraSauceDecorator;
import Decorator.Interfaces.Burger;

public class Main {
    public static void main(String[] args) {

        Burger spicyBurger = new SpicyBurger();

        // default price without extra components  (100.0$)
        System.out.println("Price of Spicy burger is:\n" + spicyBurger.getPrice() + "$");

        // with extra sauce  (100.0 + 15.9 = 115.9$)
        spicyBurger = new ExtraSauceDecorator(spicyBurger);
        System.out.println("Price of Spicy burger with extra sauce is:\n" + spicyBurger.getPrice() + "$");

        // and so on...
    }
}