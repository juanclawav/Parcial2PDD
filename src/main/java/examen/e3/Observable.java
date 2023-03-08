package examen.e3;

interface Observable {
    void addSubscriber(Observer observer);

    void removeSubscriber(Observer observer);

    void notifySubscribers(String postType);
}
