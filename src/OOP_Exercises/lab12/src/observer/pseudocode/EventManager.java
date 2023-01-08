package OOP_Exercises.lab12.src.observer.pseudocode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    private HashMap<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, String data) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.update(data);
        }
    }
}

