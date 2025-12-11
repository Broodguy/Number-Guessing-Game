package net.broodguy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int totalGuesses = 0;
        int usedGuesses = 0;
        int guess;
        int highscore;
        int difficulty;
        int round;

        System.out.println(
                "Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100."
        );
        round = 1;

        while (true){
            System.out.printf("Round %d!", round);
            number = getRandomNumber();
            System.out.println();
            System.out.println(
                    "Please select the difficulty level:\n" +
                    "1. Easy (10 chances)\n" +
                    "2. Medium (5 chances)\n" +
                    "3. Hard (3 chances)"
            );
            System.out.println();
            System.out.print("Enter your choice: ");
            difficulty = sc.nextInt();
            System.out.println();

            switch (difficulty){
                case 1:
                    totalGuesses = 10;
                    System.out.println(
                            "Great! You have selected the Easy difficulty level.\n" +
                            "Let's start the game!");
                    break;
                case 2:
                    totalGuesses = 5;
                    System.out.println(
                            "Great! You have selected the Medium difficulty level.\n" +
                            "Let's start the game!");
                    break;
                case 3:
                    totalGuesses = 3;
                    System.out.println(
                            "Great! You have selected the Hard difficulty level.\n" +
                            "Let's start the game!");
                    break;
            }
            System.out.println();

            while (true){
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
                usedGuesses++;
                String result = checkNum(guess, number, usedGuesses);
                System.out.println();
                System.out.println(result);
                if (result.equals("Congratulations! You guessed the correct number in " + usedGuesses + " attempts.")){

                    break;
                }else if(usedGuesses == totalGuesses){
                    System.out.println("You are out of guesses! The number was " + number + ".");
                    break;
                }
                System.out.println();
            }

            System.out.println("Would you like to play again (Y/N): ");
            char input = sc.next().toUpperCase().charAt(0);
            switch (input){
                case 'Y':
                    round++;
                    System.out.println();
                    break;
                case 'N':
                    return;
            }






        }
    }

    private static int getRandomNumber(){
        return (int) Math.round(Math.random() * 100);
    }

    private static String checkNum(int guess, int correct, int guesses) {
        if (guess == correct){
            return "Congratulations! You guessed the correct number in " + guesses + " attempts.";
        }else{
            if (guess > correct){
                return "Incorrect! The number is less than " + guess + ".";
            }
            if (guess < correct){
                return "Incorrect! The number is greater than " + guess + ".";
            }
        }

        return "something is not right";
    }
}