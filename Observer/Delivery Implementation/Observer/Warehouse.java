package Observer;

import Observer.Interface.Subscriber;

public class Warehouse implements Subscriber {

    @Override
    public void update(String location) {
        System.out.println("Notification at Warehouse ---> Current Location: " + location);
    }

}
