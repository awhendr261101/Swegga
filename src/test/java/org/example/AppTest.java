package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testCorrectGuess() {
        assertTrue(App.checkGuess("hangman", "a"));
    }

    @Test
    public void testIncorrectGuess() {
        assertFalse(App.checkGuess("hangman", "z"));
    }

    @Test
    public void  testNumberOfLetters(){
        assertFalse(App.checkGuess("hangman", "kj"));
    }

    @Test
    public void testEmptyGuess() {
        assertFalse(App.checkGuess("hangman", " "));
    }

    @Test
    public void testNumber(){
        assertFalse(App.checkGuess("hangman", "6"));
    }

    @Test
    public void testCaseSensitiveGuess() {
        assertFalse(App.checkGuess("hangman", "A")); // current logic is case-sensitive
    }
}
