package Assignment3;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        System.out.print("Enter circle radius: ");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();

        double area = 3.14 * r * r;
        double perimeter = 2 * 3.14 * r;
        System.out.println("Area of circle is " + area);
        System.out.println("Perimeter of circle is " + perimeter);
    }

}
