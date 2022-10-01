package Observable;

import Observable.Interface.Publisher;
import Observer.Interface.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class EventManager implements Publisher {
    private final List<Subscriber> subscribers;

    public EventManager(){
        subscribers = new ArrayList<Subscriber>();
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
    public void notifyAllSubscribers() {
        for(Subscriber subscriber: subscribers){
            subscriber.update();
        }
    }
}
