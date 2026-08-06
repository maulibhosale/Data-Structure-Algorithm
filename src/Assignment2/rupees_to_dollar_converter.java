package Assignment2;

import java.util.Scanner;

public class rupees_to_dollar_converter {
    public static void main(String[] args) {

        System.out.print("Enter the amount in rupees: ");
        Scanner input = new Scanner(System.in);
        int rup = input.nextInt();

        double dol = rup / 95.13 ;

        System.out.println(rup + " rupees is equal to " + dol + " $." );

    }
}
