package Assignment3;

import java.util.Scanner;

public class Square {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter side of square s: ");
        int s = in.nextInt();

        int area = s * s;
        int perimeter = 4 * s;

        System.out.println("Area of square is " + area);
        System.out.println("Perimeter of square is " + perimeter);

    }

}
