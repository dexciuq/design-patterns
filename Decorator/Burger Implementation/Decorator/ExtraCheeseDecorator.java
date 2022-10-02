package Decorator;

import Decorator.Interfaces.Burger;
import Decorator.Interfaces.BurgerDecorator;

public class ExtraCheeseDecorator extends BurgerDecorator {

    public ExtraCheeseDecorator(Burger burger) {
        super(burger);
    }

    public double getCheesePrice() {
        return 20.9;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + getCheesePrice();
    }
}
