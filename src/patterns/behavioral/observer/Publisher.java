package patterns.behavioral.observer;

public interface Publisher {

    void addSubscriber(String event , Subscriber obj);
    void removeSubscriber(String event, Subscriber obj);
    void notifySubscribers(String event, String message);
    void updateData(String event, String data);
}
