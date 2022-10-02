package Decorator;

import Decorator.Interfaces.Burger;
import Decorator.Interfaces.BurgerDecorator;

public class ExtraSauceDecorator extends BurgerDecorator {
    public ExtraSauceDecorator(Burger burger) {
        super(burger);
    }

    public double getSaucePrice(){
        return 15.9;
    }
    @Override
    public double getPrice() {
        return super.getPrice() + getSaucePrice();
    }
}
