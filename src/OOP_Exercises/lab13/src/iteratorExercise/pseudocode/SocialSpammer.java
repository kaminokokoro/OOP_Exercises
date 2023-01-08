package OOP_Exercises.lab13.src.iteratorExercise.pseudocode;

public class SocialSpammer {
    public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileId, String message) {
        System.out.println("\nIterating over friends...\n");
        iterator = network.createFriendsIterator(profileId);
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getId(), message);
        }
    }

    public void sendSpamToCoworkers(String profileId, String message) {
        System.out.println("\nIterating over coworkers...\n");
        iterator = network.createCoworkersIterator(profileId);
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getId(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Sent message to: '" + email + "'. Message body: '" + message + "'");
    }
}

