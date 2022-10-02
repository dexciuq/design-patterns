package Obserable;

import Observer.Interface.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class DeliveryData implements Publisher{

    List<Subscriber> subscribers;

    public DeliveryData() {
        this.subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyAllSubscribers(String location) {
        for (Subscriber subscriber: subscribers){
            subscriber.update(location);
        }
    }

    public void setLocation(String location){
        notifyAllSubscribers(location);
    }
}
