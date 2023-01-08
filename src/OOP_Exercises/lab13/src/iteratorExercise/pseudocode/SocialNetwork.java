package OOP_Exercises.lab13.src.iteratorExercise.pseudocode;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);

    ProfileIterator createCoworkersIterator(String profileId);
}
