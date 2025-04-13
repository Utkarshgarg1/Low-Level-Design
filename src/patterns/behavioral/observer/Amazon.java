package patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Amazon implements Publisher{

    private Map<String, List<Subscriber>>list;
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
    public void notifySubscriber(String event, String data) {
        list
         list.forEach((event, list)->{
            list.forEach(obj -> obj.update());
         });
        }

    @Override
    public void updateData(String event, String data) {
          notifySubscriber(event,data);
    }
}
