package Decorator.Interfaces;

public abstract class BurgerDecorator implements Burger {
    private Burger burger;

    public BurgerDecorator(Burger burger) {
        this.burger = burger;
    }

    @Override
    public double getPrice() {
        return burger.getPrice();
    }
}
