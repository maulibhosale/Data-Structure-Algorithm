package Assignment3;

import java.util.Scanner;

public class Fibonacci_series {

    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        int count = 2;

        System.out.print("Enter the nth number you want fibonacci number of: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while(n >= count) {
            int temp = b;
            b = b + a;
            a = temp;
            count ++;
        }

        System.out.println("The " + n + "th fibonacci number is " + b);

    }

}
