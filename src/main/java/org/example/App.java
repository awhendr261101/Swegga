package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String[] words = { "maven", "java", "ubuntu", "hangman", "openai" };
        String word = words[(int) (Math.random() * words.length)];
        String hiddenWord = word.replaceAll(".", "_");
        int attempts = 6;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Hangman!");
        System.out.println("You have " + attempts + " attempts to guess the word.");

        while (attempts > 0 && hiddenWord.contains("_")) {
            System.out.println("Word: " + hiddenWord);
            System.out.print("Guess a letter: ");
            String guess = scanner.next().toLowerCase();

            if (guess.length() != 1 || !Character.isLetter(guess.charAt(0))) {
                System.out.println("Invalid input. Please guess a single letter.");
                continue;
            }

            if (word.contains(guess)) {
                StringBuilder updatedWord = new StringBuilder(hiddenWord);
                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == guess.charAt(0)) {
                        updatedWord.setCharAt(i, guess.charAt(0));
                    }
                }
                hiddenWord = updatedWord.toString();
                System.out.println("Good guess!");
            } else {
                attempts--;
                System.out.println("Wrong guess. Attempts left: " + attempts);
            }
        }

        if (!hiddenWord.contains("_")) {
            System.out.println("Congratulations! The word was: " + word);
        } else {
            System.out.println("Out of attempts! The word was: " + word);
        }

        scanner.close();
    }

    public static boolean checkGuess(String word, String guess) {
        if (guess.length() == 0 || guess.equals(" ")){
            return false;
        } else {
            return word.contains(guess);
        }
    }
}
