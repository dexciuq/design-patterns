package Observable.Interface;

import Observer.Interface.Subscriber;

public interface Publisher {
    void subscribe(Subscriber subscriber);
    void unsubscribe(Subscriber subscriber);
    void notifyAllSubscribers();
}
