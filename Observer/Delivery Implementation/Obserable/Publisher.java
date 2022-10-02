package Obserable;

import Observer.Interface.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifyAllSubscribers(String location);
}
