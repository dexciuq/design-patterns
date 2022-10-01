package Shop;

import Payment.Interface.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public List<Item> itemList;

    public ShoppingCart(){
        itemList = new ArrayList<Item>();
    }

    public void addItem(Item item){
        this.itemList.add(item);
    }

    public void removeItem(Item item){
        this.itemList.remove(item);
    }

    public double totalCost(){
        double sum = 0;
        for(Item item: itemList){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy paymentMethod){
        paymentMethod.pay(totalCost());
    }

}
