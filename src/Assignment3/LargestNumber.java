package Assignment3;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int largest = 0;
        int number;

        System.out.print("Enter a number: ");
        number = in.nextInt();

        while (number != 0) {

            if (number > largest) {
                largest = number;
            }

            System.out.print("Enter a number: ");
            number = in.nextInt();
        }

        System.out.println("Largest number = " + largest);
    }

}


