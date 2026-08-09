package Assignment3;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int result = 1;

        for (int i = 1; i <=n ; i++) {
            result = result * i;
        }
        System.out.println(n + " factorial is " + result);
    }
}
