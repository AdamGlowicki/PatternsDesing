package com.patterns.excercise;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {


    private int score;
    Random random = new Random();
    Scanner scan = new Scanner(System.in);
    private static GuessGame instance = new GuessGame();

    private GuessGame() {
    }

    public static GuessGame getInstance() {
        return instance;
    }

    private Object readResolve() {
        return getInstance();
    }

    public int getScore() {
        return score;
    }

    public void play() {

        for (int i =1; i<10; i++) {
            int number = random.nextInt(9);
            System.out.println("Guess number");
            int userNumber = scan.nextInt();

            if (number == userNumber) {
                System.out.println("Done");
                score++;
            } else {
                System.out.println("I was thinkn about" + number);
            }

            System.out.println("Your scote: " + score);
        }
    }
}
