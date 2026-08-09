package Assignment3;

import java.util.Scanner;

public class Discount {

    public static void main(String[] args) {

        System.out.print("Enter product price: ");
        Scanner in = new Scanner(System.in);
        int price = in.nextInt();

        System.out.print("Enter the percentage of discount on the product: ");
        int disc = in.nextInt();

        double discount_amount = (price * disc) / 100;
        double final_price = price - discount_amount ;

        System.out.println("The final price after discount is: " + final_price);
    }

}
