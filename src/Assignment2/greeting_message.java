package Assignment2;

import java.util.Scanner;

public class greeting_message {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hello " + name  + "..! Wish you have a beautiful day :) ");
    }
}
