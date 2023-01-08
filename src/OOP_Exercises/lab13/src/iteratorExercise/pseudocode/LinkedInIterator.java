package OOP_Exercises.lab13.src.iteratorExercise.pseudocode;

import java.util.List;

public class LinkedInIterator implements ProfileIterator {
    private LinkedIn linkedIn;
    private String type;
    private String profileId;
    private int currentPosition = 0;
    private Profile[] cache;

    public LinkedInIterator(LinkedIn linkedIn, String profileId, String type) {
        this.linkedIn = linkedIn;
        this.type = type;
        this.profileId = profileId;
    }

    private void lazyInit() {
        if (cache == null) {
            List<String> profiles = linkedIn.socialGraphRequest(this.profileId, this.type);
            cache = new Profile[profiles.size()];
            int i = 0;
            for (String profile : profiles) {
                cache[i++] = linkedIn.requestContactInfoFromLinkedInAPI(profile);
            }
        }
    }

    @Override
    public boolean hasMore() {
        lazyInit();
        return currentPosition < cache.length;
    }

    @Override
    public Profile getNext() {
        if (!hasMore()) {
            return null;
        }
        Profile friendContact = cache[currentPosition];
//        if (friendContact == null) {
//            friendContact = linkedIn.requestContactInfoFromLinkedInAPI(friendContact.getId());
//            cache[currentPosition] = friendContact;
//        }
        currentPosition++;
        return friendContact;
    }

}
