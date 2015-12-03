package com.aiello.exercise;

public class Reverse {

    /**
     * Accepts a character array and returns this in reverse order
     * @param original
     * @return
     */
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

    /**
     * Accepts a string and returns it in reverse
     * @param original
     * @return
     */
    public static String reverseString(String original) {
        if (original == null || original.length() == 0) {
            return original;
        }

        char[] reverse = new char[original.length()];

        for (int i = 0, j=original.length()-1; i <= original.length() - 1; i++, j--) {
            reverse[j] = original.charAt(i);
        }

        return new String(reverse);
    }

    /**
     * Accepts a integer array and returns each value in reverse order
     * @param original
     * @return
     */
    public static int[] reverseIntegerArray(int[] original) {
        if (original == null || original.length == 0) {
            return original;
        }

        int[] reverse = new int[original.length];
        int index=0;

        for (int i = original.length - 1; i >= 0; i--, index++) {
            reverse[index] = original[i];
        }

        return reverse;
    }
}
