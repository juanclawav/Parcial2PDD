package examen.e3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FacebookPage facebookPage = new FacebookPage();
        Observer subscriber1 = new User(1,"video");
        Observer subscriber2 = new User(2,"posts");
        Observer subscriber3 = new User(5,"video");
        Observer subscriber4 = new User(4,"video");
        Observer subscriber5 = new User(3,"posts");
        facebookPage.addSubscriber(subscriber1);
        facebookPage.addSubscriber(subscriber2);
        facebookPage.addSubscriber(subscriber3);
        facebookPage.addSubscriber(subscriber4);
        facebookPage.addSubscriber(subscriber5);
        facebookPage.notifySubscribers("imagen");
        facebookPage.notifySubscribers("video");
        facebookPage.notifySubscribers("imagen");
        facebookPage.notifySubscribers("video");
    }
}

