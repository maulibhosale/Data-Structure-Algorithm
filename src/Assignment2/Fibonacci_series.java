package Assignment2;

import java.util.Scanner;

public class Fibonacci_series {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = 0;
        int b = 1;
        int count = 2;     // we already have first_two no's so count starts from 2

        while(count <= n) {
            int temp = b;      // we give temporary value to b
            b = b + a;        // b updates its value
            a = temp;         // a get the temp (old b) value
            count++;          // count increases by 1
        }

        System.out.println(b);
    }
}

