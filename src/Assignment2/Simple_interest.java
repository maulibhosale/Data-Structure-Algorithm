package Assignment2;

import java.util.Scanner;

public class Simple_interest {
    public static void main(String[] args) {

        System.out.print("Enter principal amount: ");
        Scanner principal = new Scanner(System.in);
        int p = principal.nextInt();

        System.out.print("Enter the time period in months: ");
        Scanner time = new Scanner(System.in);
        int t = time.nextInt();

        System.out.print("Enter the rate in percent: ");
        Scanner rate = new Scanner(System.in);
        int r = rate.nextInt();

        int simple_interest = (p * r * t) / 100;

        System.out.println("Your Simple interest is: " + simple_interest);
    }
}
