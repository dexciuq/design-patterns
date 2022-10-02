package Decorator;

import Decorator.Interfaces.Burger;
import Decorator.Interfaces.BurgerDecorator;

public class ExtraMeatDecorator extends BurgerDecorator {
    public ExtraMeatDecorator(Burger burger) {
        super(burger);
    }

    public double getMeatPrice(){
        return 35.9;
    }
    @Override
    public double getPrice() {
        return super.getPrice() + getMeatPrice();
    }
}
