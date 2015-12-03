package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseTest {
    @Test
    public void reverseCharacterArray() {
        Character[] original = {'a', 'b', 'c', 'd'};
        Character[] reverse = Reverse.reverseCharacterArray(original);
        assertThat(reverse).isEqualTo(new Character[] {'d','c','b','a'});
    }

    @Test
    public void reverseNullValueInCharacterArray() {
        Character[] original = {'a', 'b', null, 'd'};
        Character[] reverse = Reverse.reverseCharacterArray(original);
        assertThat(reverse).isEqualTo(new Character[] {'d',null,'b','a'});
    }

    @Test
    public void reverseEmptyCharacterArray() {
        Character[] original = {};
        Character[] reverse = Reverse.reverseCharacterArray(original);
        assertThat(reverse).isEqualTo(new Character[] {});
    }

    @Test
    public void reverseNullCharacterArray() {
        Character[] reverse = Reverse.reverseCharacterArray(null);
        assertThat(reverse).isEqualTo(null);
    }

    @Test
    public void reverseString() {
        String original = "abcd";
        String reverse = Reverse.reverseString(original);
        assertThat(reverse).isEqualTo("dcba");
    }

    @Test
    public void reverseNullString() {
        String reverse = Reverse.reverseString(null);
        assertThat(reverse).isEqualTo(null);
    }

    @Test
    public void reverseEmptyString() {
        String original = "";
        String reverse = Reverse.reverseString(original);
        assertThat(reverse).isEqualTo("");
    }

    @Test
    public void reverseIntegerArray() {
        int[] original = new int[] {1,2,3,4,5,6,7,8,9};
        int[] reverse = Reverse.reverseIntegerArray(original);
        assertThat(reverse).isEqualTo(new int[]{9,8,7,6,5,4,3,2,1});
    }
}
