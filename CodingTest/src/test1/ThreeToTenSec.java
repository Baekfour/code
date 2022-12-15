package test1;

import java.util.HashMap;

public class ThreeToTenSec {

    public static int solution(String s) {
        // Create a HashMap to store the character occurrences in the string
        HashMap<Character, Integer> occurrences = new HashMap<>();

        // Store the length of the string
        int n = s.length();

        // Initialize the beauty of all substrings to 0
        int beauty = 0;

        // Iterate over the string from left to right
        for (int i = 0; i < n; i++) {
            // Get the current character
            char c = s.charAt(i);

            // If the character is not in the HashMap, add it with a value of 1
            if (!occurrences.containsKey(c)) {
                occurrences.put(c, 1);
            }
            // Otherwise, increment the value of the character in the HashMap
            else {
                occurrences.put(c, occurrences.get(c) + 1);
            }

            // If there is more than one character in the HashMap, add the value of j - i
            // to the beauty of all substrings
            if (occurrences.size() > 1) {
                beauty += i + 1;
            }
        }

        // Return the beauty of all substrings
        return beauty;
    }

}

