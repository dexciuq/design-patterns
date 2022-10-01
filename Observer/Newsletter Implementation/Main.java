import Observable.EventManager;
import Observer.EventListener;

public class Main {

    public static void main(String[] args) throws Exception {

        EventManager eventManager = new EventManager();

        EventListener dimash = new EventListener("dimash@gmail.com");
        EventListener zhasulanov = new EventListener(("zhasulanov@gmail.com"));
        eventManager.subscribe(dimash);
        eventManager.subscribe(zhasulanov);

        eventManager.notifyAllSubscribers();

        System.out.println("----------------------------");

        eventManager.unsubscribe(zhasulanov);

        eventManager.notifyAllSubscribers();
    }
}