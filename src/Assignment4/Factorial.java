package Assignment4;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Factorial f = new Factorial();
        f.Calculate();
    }

    public void Calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        sc.close();

        if (n == 0 || n == 1) {
            System.out.println(n+ "! = 1");
        }

        int fact = 1;
        String steps = "";

        for(int i = n; i>=1 ; i--) {
            fact *= i ;

            if (i==1) {
                steps += i;
            }
            else {
                steps += i + " * ";
            }
        }

        System.out.println(n+"! = " +steps+ " = " +fact);

    }

}
