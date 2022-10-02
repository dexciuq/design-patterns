package Observer;

import Observer.Interface.Subscriber;

public class Seller implements Subscriber {
    @Override
    public void update(String location) {
        System.out.println("Notification at Seller ---> Current Location: " + location);
    }

}
