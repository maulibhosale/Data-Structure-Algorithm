package Assignment3;

import java.util.Scanner;

public class Isosceles_triangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of the triangle l: ");
        int l = in.nextInt();

        System.out.print("Enter breadth of the triangle b: ");
        int b = in.nextInt();

        System.out.print("Enter height of the triangle h: ");
        int h = in.nextInt();

        double area = 0.5 * b * h;

        System.out.println("Area of triangle is " + area);

    }
}
