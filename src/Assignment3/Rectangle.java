package Assignment3;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter length of the rectangle l: ");
        int l = in.nextInt();

        System.out.print("Enter breadth of the rectangle b: ");
        int b = in.nextInt();

        int area = l * b;
        int perimeter = l + b;

        System.out.println("Area of rectangle is " + area);
        System.out.println("Perimeter of rectangle is " + perimeter);

    }

}
