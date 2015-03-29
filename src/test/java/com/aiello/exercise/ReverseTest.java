package com.aiello.exercise;

import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseTest {
    @Test
    public void reverseCharacterArray() {
        Character[] original = {'a', 'b', 'c', 'd'};
        Character[] reverse = Reverse.reverseCharacterArray(original);
        assertThat(reverse).isEqualTo(new Character[] {'d','c','b', 'a'});
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
}
