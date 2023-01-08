package OOP_Exercises.lab13.src.iteratorExercise.pseudocode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    private String id;
    private String email;

    private Map<String, List<String>> contacts = new HashMap<>();

    public Profile(String email, String id, String... contacts) {
        this.email = email;
        this.id = id;

        for (String contact : contacts) {
            String[] parts = contact.split(":");
            String contactType = "friend", contactId;
            if (parts.length == 1) {
                contactId = parts[0];
            } else {
                contactType = parts[0];
                contactId = parts[1];
            }
            if (!this.contacts.containsKey(contactType)) {
                this.contacts.put(contactType, new ArrayList<>());
            }
            this.contacts.get(contactType).add(contactId);
        }
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getContacts(String type) {
        if (!this.contacts.containsKey(type)) {
            this.contacts.put(type, new ArrayList<>());
        }
        return contacts.get(type);
    }

}

