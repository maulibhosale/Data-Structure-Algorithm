package Assignment4;

import java.util.Scanner;

public class PythagoreanTriplet {

    public static void main(String[] args) {
        PythagoreanTriplet pt = new PythagoreanTriplet();
        pt.Calculate();
    }

    public void Calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        int greatest, smallest_1, smallest_2 ;

        if (a >= b && a >= c) {
            greatest = a;
            smallest_1 = b;
            smallest_2 = c;
        } else if (b >= a && b >= c) {
            greatest = b;
            smallest_1 = a;
            smallest_2 = c;
        } else {
            greatest = c;
            smallest_1 = a;
            smallest_2 = b;
        }


        if( (greatest*greatest) == (smallest_1*smallest_1) + (smallest_2*smallest_2) ) {
            System.out.println("Given triplet is a Pythagorean triplet");
        }
        else {
            System.out.println("Given triplet is not a Pythagorean triplet");
        }
    }

}
