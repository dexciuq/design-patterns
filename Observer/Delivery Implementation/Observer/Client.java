package Observer;

import Observer.Interface.Subscriber;

public class Client implements Subscriber {

    @Override
    public void update(String location) {
        System.out.println("Notification at Client ---> Current Location: " + location);
    }

}
