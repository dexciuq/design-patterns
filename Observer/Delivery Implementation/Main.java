import Obserable.*;
import Observer.*;
import Observer.Interface.Subscriber;

public class Main {
    public static void main(String[] args) {
        DeliveryData deliveryNotification = new DeliveryData();

        Subscriber seller = new Seller();
        Subscriber client = new Client();
        Subscriber warehouse = new Warehouse();

        deliveryNotification.subscribe(seller);
        deliveryNotification.subscribe(client);
        deliveryNotification.subscribe(warehouse);

        System.out.println("Delivery started...");
        deliveryNotification.setLocation("Astana");
        System.out.println("\n----------------------------------------------------\n");

        deliveryNotification.setLocation("Kostanai");
        System.out.println("\n----------------------------------------------------\n");

        deliveryNotification.unsubscribe(warehouse);
        deliveryNotification.setLocation("Almaty");
        System.out.println("Delivery ended");
    }
}