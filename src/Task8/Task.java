package Task8;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  first integer = " );
        int input = scanner.nextInt();

        System.out.print("Enter  second integer = " );
        int input1 = scanner.nextInt();

        Formula sum = new Formula();
        int Result = sum.addition( input, input1);
        int Result1 = sum.subtraction(input,input1);
        int Result2 = sum.product(input,input1);

        System.out.println("sum of two numbers = " + Result );
        System.out.println("Difference of two integer= "+ Result1 );
        System.out.println("Product of two integer= "+ Result2 );
        System.out.printf("Average of two integers: %.2f%n", (double) (Result) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(input - input1));
        System.out.printf("Max integer: %d%n", Math.max(input, input1));
        System.out.printf("Min integer: %d%n", Math.min(input, input1));
    }
}
