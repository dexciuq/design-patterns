package Observer;

import Observer.Interface.Subscriber;

public class EventListener implements Subscriber {

    private String emailId;

    public EventListener(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void update() {
        System.out.println("Message was sent to " + emailId + " successfully");
    }
}
