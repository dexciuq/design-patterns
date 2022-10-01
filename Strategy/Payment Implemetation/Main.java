import Payment.CreditCardStrategy;
import Payment.PayPalStrategy;
import Shop.Item;
import Shop.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem(new Item("0364522654", 19.9));
        shoppingCart.addItem((new Item ("564230545", 26.9)));

        // (Fake data...)
        // Payment by CreditCard
        shoppingCart.pay(new CreditCardStrategy("Zhasulanov Dinmukhammed",
                "1234546483154", "1545", "20-06-2027"));

        // Payment by PayPal
        shoppingCart.pay(new PayPalStrategy("dimash@gmail.com", "dimash123"));
    }
}