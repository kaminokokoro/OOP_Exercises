package OOP_Exercises.lab13.src.iteratorExercise.pseudocode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please specify social network to target spam tool (default:Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        } else {
            network = new Facebook(createTestProfiles());
        }

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Hey! This is Anna's friend Josh. Can you do me a favor and like this post [link]?");
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Hey! This is Anna's boss Jason. Anna told me you would be interested in [link].");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<>();
        data.add(new Profile("anna.smith@bing.com", "anna.smith@bing.com", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "mad_max@ya.com", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "bill@microsoft.eu", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "avanger@ukr.net", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "sam@amazon.com", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "catwoman@yahoo.com", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
