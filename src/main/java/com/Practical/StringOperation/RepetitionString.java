package com.Practical.StringOperation;

public class RepetitionString {
    public static void main(String[] args) {
        String s = "vaibhav";

        // Iterate through each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int count = 0;

            // Count the number of occurrences of the current character
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Print if the character is repeated
            if (count > 1) {
                System.out.println("Character '" + currentChar + "' is repeated " + count + " times.");
            }
        }
    }
}

