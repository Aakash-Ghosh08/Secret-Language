package secretLanguage;

import java.util.HashMap;
import java.util.Scanner;

public class Decryption {
    public static void main(String[] args) {
        HashMap<String, Character> reverseTranslationMap = new HashMap<>();
        reverseTranslationMap.put("ki", 'a');
        reverseTranslationMap.put("lo", 'e');
        reverseTranslationMap.put("ma", 'i');
        reverseTranslationMap.put("nu", 'o');
        reverseTranslationMap.put("po", 'u');
        
        reverseTranslationMap.put("a", 'b');
        reverseTranslationMap.put("e", 'c');
        reverseTranslationMap.put("i", 'd');
        reverseTranslationMap.put("o", 'f');
        reverseTranslationMap.put("u", 'g');
        // Add reverse mappings as needed...

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a secret language sentence to translate back to English: ");
        String secretSentence = scanner.nextLine();
        StringBuilder englishSentence = new StringBuilder();

        for (int i = 0; i < secretSentence.length(); i++) {
            boolean matched = false;

            // Check for multi-character mappings
            for (String key : reverseTranslationMap.keySet()) {
                if (secretSentence.startsWith(key, i)) {
                    englishSentence.append(reverseTranslationMap.get(key));
                    i += key.length() - 1; // Move index forward
                    matched = true;
                    break;
                }
            }

            if (!matched) {
                englishSentence.append(secretSentence.charAt(i)); // Append as-is
            }
        }

        System.out.println("English Sentence: " + englishSentence);
    }
}
