package Assignment4;

import java.util.Scanner;

public class Grades {

    public void Check() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        sc.close();

        if (marks <= 100 && marks >=91) {
            System.out.println("AA Grade");
        }
        else if (marks <= 90 && marks >=81) {
            System.out.println("AB Grade");
        }
        else if (marks <= 80 && marks >=71) {
            System.out.println("BB Grade");
        }
        else if (marks <= 70 && marks >=61) {
            System.out.println("BC Grade");
        }
        else if (marks <= 60 && marks >=51) {
            System.out.println("CD Grade");
        }
        else if (marks <= 50 && marks >=41) {
            System.out.println("DD Grade");
        }
        else {
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {
        Grades g = new Grades();
        g.Check();
    }

}
