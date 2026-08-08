package Assignment3;

import java.util.Scanner;

public class Cone {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter radius of cone r: ");
        int r = in.nextInt();

        System.out.print("Enter height of cone h: ");
        int h= in.nextInt();

        System.out.print("Enter length of cone l: ");
        int l= in.nextInt();

        double volume = ( 3.14 * r * r * h ) / 3 ;

        System.out.println("Volume of cone is " + volume);

    }

}
