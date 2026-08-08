package Assignment3;

import java.util.Scanner;

public class DigitCalculation {

    public static void main(String[] args) {

        System.out.print("Enter the Integer: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        int product = 1;
        int sum = 0;
        int n = a;

        while (n > 0) {
            int digit = n % 10;
            product = product * digit;
            sum = sum + digit;
            n = n / 10;
        }

        int result = product - sum;

        System.out.println("Product of the digits of the integer are " + product);
        System.out.println("Sum of the digits of the integer are " + sum);
        System.out.println("Result = Product - Sum = " + result);

    }
}
