package Assignment4;

import java.util.Scanner;

public class Product {

    public void Multiply() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a * b;
        System.out.println("Product of " +a+ " * " +b+ " is = " +c);
    }

    public static void main(String[] args) {
        Product s = new Product();
        s.Multiply();
    }

}
