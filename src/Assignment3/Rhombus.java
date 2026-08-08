package Assignment3;

import java.util.Scanner;

public class Rhombus {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter diagonal_1 value: ");
        int d1 = in.nextInt();

        System.out.print("Enter diagonal_2 value: ");
        int d2= in.nextInt();

        System.out.print("Enter side value a: ");
        int a= in.nextInt();

        int area = (d1 * d2) / 2 ;
        int perimeter = 4 * a;

        System.out.println("Area of rhombus is " + area);
        System.out.println("Perimeter of rhombus is " + perimeter);

    }

}
