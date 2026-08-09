package Assignment3;

import java.util.Scanner;

public class FactorsOfNumber {

    public static void main(String[] args) {

        System.out.print("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int i = 1;

        while ( n >= i) {
            if (n % i == 0) {
                System.out.println(i + " is factor of " + n);
            }
            else {
                System.out.println(i + " is not factor of " + n);
            }
            i++;

        }
    }
}
