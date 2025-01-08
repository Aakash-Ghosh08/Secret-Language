package secretLanguage;

import java.util.HashMap;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        HashMap<Character, String> translationMap = new HashMap<>();
        translationMap.put('a', "ki");
        translationMap.put('e', "lo");
        translationMap.put('i', "ma");
        translationMap.put('o', "nu");
        translationMap.put('u', "po");
        
        translationMap.put('b', "a");
        translationMap.put('c', "e");
        translationMap.put('d', "i");
        translationMap.put('f', "o");
        translationMap.put('g', "u");
        // Add more consonant-to-vowel mappings as needed...

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence to translate into secret language: ");
        String sentence = scanner.nextLine().toLowerCase();
        StringBuilder secretSentence = new StringBuilder();

        for (char c : sentence.toCharArray()) {
            if (translationMap.containsKey(c)) {
                secretSentence.append(translationMap.get(c));
            } else {
                secretSentence.append(c); // Keep spaces, punctuation, etc.
            }
        }

        System.out.println("Secret Language: " + secretSentence);
    }
}