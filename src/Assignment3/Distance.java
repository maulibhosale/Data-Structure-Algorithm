package Assignment3;

import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {

        System.out.print("Enter the first point (x1, y1) = ");
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("Enter the first point (x2, y2) = ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double distance = (y2 - y1) / (x2 - x1);
        System.out.println("The distance betwwen two points is: " + distance);
    }
}
