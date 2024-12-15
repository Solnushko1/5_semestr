import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
class EventManager {
    private final Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... eventTypes) {
        for (String eventType : eventTypes) {
            listeners.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
        System.out.println("Подписчик добавлен на событие: " + eventType);
    }

    public void notify(String eventType, String data, String city) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            if (listener instanceof User) {
                User user = (User) listener;
                if (user.getCity().equalsIgnoreCase(city)) {
                    user.update(data);
                }
            }
        }
    }

}