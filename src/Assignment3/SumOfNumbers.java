package Assignment3;

import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int sum = 0;
        int num;

        System.out.print("Enter a number: ");
        num = in.nextInt();

        while (num != 0) {

            sum = sum + num;

            System.out.print("Enter a number: ");
            num = in.nextInt();
        }

        System.out.println("Sum = " + sum);
    }

}
