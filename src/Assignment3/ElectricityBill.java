package Assignment3;

import java.util.Scanner;

public class ElectricityBill {

    public static void main(String[] args) {

        System.out.println("Enter the units consumed: ");
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();

        if( unit >= 201) {
            int bill = unit * 10;
            System.out.println("Your Electricity Bill is " + bill + " rupees.");
        }  else if (unit >= 101) {
            int bill = unit * 7;
            System.out.println("Your Electricity Bill is " + bill + " rupees.");
        } else if ( unit >= 0 ) {
            int bill = unit * 5;
            System.out.println("Your Electricity Bill is " + bill + " rupees.");
        }
        else {
            System.out.println("Incorrect reading entered.");
        }

    }
}
