package Assignment2;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {

        System.out.print("Enter 1st number: ");
        Scanner n1 = new Scanner(System.in);
        int num1 = n1.nextInt();

        System.out.print("Enter the operator : ");
        Scanner op = new Scanner(System.in);
        char operator = op.next().charAt(0);

        System.out.print("Enter 2nd number: ");
        Scanner n2 = new Scanner(System.in);
        int num2 = n2.nextInt();

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;

        if(operator == '+'){
            System.out.println(addition);
        }
        else if (operator == '-') {
            System.out.println(subtraction);
        }
        else if (operator == '*') {
            System.out.println(multiplication);
        }
        else if (operator == '/') {
            if (num2 != 0) {
                System.out.println(division);
            }
            else {
                System.out.println("Number can't be divided by zero.");
            }
        }
        else{
            System.out.println("Operator doesn't exist");
        }

    }
}
