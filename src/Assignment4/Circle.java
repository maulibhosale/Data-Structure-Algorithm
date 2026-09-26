package Assignment4;

import java.util.Scanner;

public class Circle {

    public static double Circumference(int r){
        double c = 2 * 3.14 * r;
        System.out.println("Circumference of the circle is " +c);
        return 0;
    }

    public static double Area(int r){
        double a = 3.14 * r * r;
        System.out.println("Area of the circle is " +a);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle r: ");
        int r = sc.nextInt();

        double p = Circumference(r);
        double q = Area(r);

        System.out.println( p + q);

    }

}
