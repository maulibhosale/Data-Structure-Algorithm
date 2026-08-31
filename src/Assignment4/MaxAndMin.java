package Assignment4;

import java.util.Scanner;

public class MaxAndMin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number :");
        int first = sc.nextInt();

        System.out.println("Enter second number :");
        int second = sc.nextInt();

        System.out.println("Enter third number :");
        int third = sc.nextInt();

        int max = largest(first, second, third);
        int min = smallest(first, second, third);

        System.out.println("Maximum number is: " + max);
        System.out.println("Minimum number is: " + min);
    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
        if (third > max) {
            max = third;
        }
        return max;
    }
    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
        if (third < min) {
            min = third;
        }
        return min;
    }
}