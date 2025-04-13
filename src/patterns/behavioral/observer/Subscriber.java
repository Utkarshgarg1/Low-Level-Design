package patterns.behavioral.observer;

public interface Subscriber {
    void update(String event, String data);
}
