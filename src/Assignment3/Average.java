package Assignment3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to enter: ");
        int n = in.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter number " + i + ": ");
            int number = in.nextInt();

            sum = sum + number;
        }

        double average = sum / n;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}