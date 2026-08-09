package Assignment3;

import java.util.Scanner;

public class Commission {

    public static void main(String[] args) {

        System.out.print("Enter actual amount: ");
        Scanner in = new Scanner(System.in);
        int amount = in.nextInt();

        System.out.print("Enter the percentage of commision on the amount: ");
        double per = in.nextDouble();

        double commission = (amount * per) / 100 ;

        System.out.println("The commision is: " + commission);
    }
}
