package Assignment3;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter how many numbers:");
        int n = in.nextInt();

        int sum = 0;

        System.out.print("Enter " + n + " numbers: ");

        for (int i = 1; i <= n; i++) {
            int num = in.nextInt();
            sum = sum + num;
        }

        double avg = (double) sum / n;

        System.out.println("Sum is: " + sum);
        System.out.println("Average is: " + avg);
    }
}