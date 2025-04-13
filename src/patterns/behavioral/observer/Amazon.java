package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Amazon implements Publisher{

    private Map<String, List<Subscriber>>list = new HashMap<>();;
    @Override
    public void addSubscriber(String event, Subscriber obj) {
         list.computeIfAbsent(event, k -> new ArrayList<>()).add(obj);
    }

    @Override
    public void removeSubscriber(String event, Subscriber obj) {
         List<Subscriber> subscribers = list.get(event);
         subscribers.remove(obj);
    }

    @Override
    public void notifySubscribers(String event, String data) {
        List<Subscriber> subscribers = list.get(event);
        subscribers.forEach(obj -> obj.update(event, data));
    }

    @Override
    public void updateData(String event, String data){
          notifySubscribers(event,data);
    }
}
