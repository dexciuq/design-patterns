import Decorator.Interfaces.Burger;

public class SpicyBurger implements Burger {
    @Override
    public double getPrice() {
        return 100;
    }
}
