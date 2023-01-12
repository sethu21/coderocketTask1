import java.util.Arrays;
import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value  = " );
        double number = input.nextDouble();
        System.out.println( "Square="+number*number );
        System.out.println("cube =" + number*number*number );
        System.out.println("4 power = " +number*number*number*number);
    }
}
