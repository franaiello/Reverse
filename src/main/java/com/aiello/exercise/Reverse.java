package com.aiello.exercise;

public class Reverse {

    public static Character[] reverseCharacterArray(Character[] original) {
        if (original == null || original.length == 0) {
            return original;
        }

        Character[] reverse = new Character[original.length];
        int index = 0;

        for (int i = original.length - 1; i >= 0; i--, index++) {
            reverse[index] = original[i];
        }

        return reverse;
    }

    public static String reverseString(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }

        char[] reverse = new char[original.length()];

        for (int i = 0, j=original.length()-1; i <= original.length() - 1; i++, j--) {
            Character c = original.charAt(i);
            reverse[j] = c;
        }

        return new String(reverse);
    }
}
