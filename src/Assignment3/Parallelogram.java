package Assignment3;

import java.util.Scanner;

public class Parallelogram {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter base of the parallelogram b: ");
        int b = in.nextInt();

        System.out.print("Enter side of the parallelogram a: ");
        int a = in.nextInt();

        System.out.print("Enter height of the parallelogram h: ");
        int h= in.nextInt();

        int area = b * h;
        int parameter = 2 * (a + b);

        System.out.println("Area of parallelogram is " + area);
        System.out.println("Parameter of parallelogram is " + parameter);

    }

}
