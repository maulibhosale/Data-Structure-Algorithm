package Assignment4;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Prime p = new Prime();
        p.Check();
    }

    public void Check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if (n < 2) {
            System.out.println(n + " is a non prime number.");
        }

        boolean isPrime = true;

        for (int i = 2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is a non prime number.");
        }

    }

}

