import java.util.Scanner;


public class Main {
    public static void main(String[] args) {



        double a = 7.2, b = 5, c = 9;


        double firstroot, secondroot;

                double det = b * b - 4 * a * c;


        if (det > 0) {

            // two real and distinct roots
            firstroot = (-b + Math.sqrt(det)) / (2 * a);
            secondroot = (-b - Math.sqrt(det)) / (2 * a);

            System.out.format(
                    "First Root = %.2f and Second Root = %.2f",
                    firstroot, secondroot);
        }


        else if (det == 0) {

            // two real and equal roots
            // determinant is equal to 0
            // so -b + 0 == -b
            firstroot = secondroot = -b / (2 * a);

            System.out.format(
                    "First Root = Second Root = %.2f;",
                    firstroot);
        }


        else {

            // roots are complex number and distinct
            double real = -b / (2 * a);

            double imaginary = Math.sqrt(-det) / (2 * a);

            System.out.printf("First Root = %.2f+%.2fi",
                    real, imaginary);
            System.out.printf("\nSecond Root = %.2f-%.2fi",
                    real, imaginary);
        }


    }
}