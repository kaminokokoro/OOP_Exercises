package OOP_Exercises.lab13.src.iteratorExercise.pseudocode;

import java.util.List;

public class FacebookIterator implements ProfileIterator {
    private Facebook facebook;
    private String type;
    private String profileId;
    private int currentPosition = 0;
    private Profile[] cache;

    public FacebookIterator(Facebook facebook, String profileId, String type) {
        this.facebook = facebook;
        this.type = type;
        this.profileId = profileId;
    }

    private void lazyInit() {
        if (cache == null) {
            List<String> profiles = facebook.socialGraphRequest(this.profileId, this.type);
            cache = new Profile[profiles.size()];
            int i = 0;
            for (String profile : profiles) {
                cache[i++] = facebook.requestProfileFromFacebook(profile);
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

        Profile friendProfile = cache[currentPosition];
//        if (friendProfile == null) {
//            friendProfile = facebook.requestProfileFromFacebook(friendProfile.getId());
//            cache[currentPosition] = friendProfile;
//        }
        currentPosition++;
        return friendProfile;
    }
}
