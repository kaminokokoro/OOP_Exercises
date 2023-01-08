package OOP_Exercises.lab03.src;

import java.util.Random;
import java.util.Scanner;

public class WordGuess1 {

    public static String[] words = {
            "testing", "hello", "world", "template", "java"
            , "maining", "computer", "processor", "univercity"
            , "boolean", "string", "integer", "character"
            , "indicator", "controller", "model", "view"
    };

    public static void main(String[] args) {
        String secretWord = setSecretWord();
        runGame(secretWord);
    }

    public static String setSecretWord() {
        Random rand = new Random();
        return words[rand.nextInt(words.length - 1)];
    }

    public static String getTrialWordWithMatches(String secretWord) {
        boolean[] secretWordMatches = new boolean[secretWord.length()];
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < secretWord.length(); i++) {
            str.append((secretWordMatches[i] ? secretWord.charAt(i) : '_'));
        }
        return str.toString();
    }

    public static void checkTrialWord(char ch) {
        String secretWord = setSecretWord();
        boolean[] secretWordMatches = new boolean[secretWord.length()];
        for (int i = 0; i < secretWord.length(); i++) {
            if (secretWordMatches[i]) {
                continue;
            }
            secretWordMatches[i] = secretWord.charAt(i) == ch;
        }
    }

    public static void runGame(String secretWord) {
        Scanner in = new Scanner(System.in);

        int trials = 0;
        while (true) {
            System.out.print("Key in one character or your guess word: ");
            String trialWord = (in.hasNext()) ? in.next() : "";

            trials++;

            if (trialWord.length() < 1) {
                continue;
            }

            if (trialWord.length() == 1) {
                checkTrialWord(trialWord.charAt(0));
                trialWord = getTrialWordWithMatches(secretWord);
                System.out.printf("Trail %1$d: %2$s\n", trials, trialWord);

            }

            if (trialWord.equals(secretWord)) {
                System.out.printf("Trail %d: Congratulation!\n", trials);
                break;
            }
        }
        System.out.printf("You got in %d trials\n", trials);
    }
}