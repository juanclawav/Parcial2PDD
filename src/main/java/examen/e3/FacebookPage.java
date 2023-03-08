package examen.e3;

import java.util.ArrayList;
import java.util.List;

class FacebookPage implements Observable {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    @Override
    public void notifySubscribers(String postType) {
        for (Observer subscriber : subscribers) {
            if (postType.equals("video")) {
                subscriber.update(postType);
            } else if (!subscriber.getTipoNotificacion().equals("video")) {
                subscriber.update((postType));
            }
        }
    }
}
