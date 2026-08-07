package Assignment2;

import java.util.Scanner;

public class largest_number {

    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        if(a>b){
            System.out.println(a + " is the largest number.");
        }
        else {
            System.out.println(b + " is the largest number");
        }
    }
}
