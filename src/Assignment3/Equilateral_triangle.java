package Assignment3;

import java.util.Scanner;

public class Equilateral_triangle {

    public static void main(String[] args) {

        System.out.print("Enter triangle side: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();

        double area = 0.43 * a * a;
        int perimeter = 3 * a;
        System.out.println("Area of equilateral triangle is " + area);
        System.out.println("Perimeter of equilateral triangle is " + perimeter);
    }

}
