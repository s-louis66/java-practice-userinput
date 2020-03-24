package com.tts2;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
	// write your code here
        System.out.println("What number do I have in mind? from 1 to 100.");
        int num = Integer.parseInt(userInput.nextLine());
        while (num != 66) {

             if (num >= 61 && num <= 71) {
                System.out.println("You're close! Guess again.");
            } else {
                System.out.println("Not even in the ballpark; guess again.");
            }

                num = userInput.nextInt();
            }
        System.out.println("You got it!");

    }
}
