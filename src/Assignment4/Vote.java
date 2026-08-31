package Assignment4;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {

        System.out.print("Enter your age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        int s = check(age);

        System.out.println(s);

    }

    public static int check(int age) {
        if (age >= 18) {
            System.out.println("You are eligible for voting");
        }
        else {
            System.out.println("You are not eligible for voting");
        }
        return 0;
    }

}
