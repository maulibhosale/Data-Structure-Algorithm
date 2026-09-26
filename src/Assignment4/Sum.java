package Assignment4;

import java.util.Scanner;

public class Sum {

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum of " +a+ " + " +b+ " is = " +c);
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        s.add();
    }
}
