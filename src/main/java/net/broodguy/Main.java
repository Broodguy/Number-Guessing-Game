package net.broodguy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        int totalGuesses;
        int usedGuesses;
        int difficulty;
        int round;

        System.out.println(
                "Welcome to the Number Guessing Game!\n" +
                "I'm thinking of a number between 1 and 100."
        );
        round = 1;

        while (true){
            System.out.println("Round " + round + "!");
            System.out.println();
            System.out.println(
                    "Please select the difficulty level:\n" +
                    "1. Easy (10 chances)\n" +
                    "2. Medium (5 chances)\n" +
                    "3. Hard (3 chances)"
            );
            System.out.println();
            System.out.print("Enter your choice: ");
            int input = sc.nextInt();
            sc.next();
            difficulty = input;

            }


        }
    }

    private static int getRandomNumber(){
        return (int) Math.round(Math.random() * 100);
    }
}