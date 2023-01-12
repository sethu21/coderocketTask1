import java.util.Arrays;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a weight in pound: ");
        double weight = input.nextInt();
        Scanner InputHeight = new Scanner(System.in);
        System.out.println("Enter a height in inc:" );
        double height = InputHeight.nextInt();
        double BMI = 703*(weight/(height*height));
        System.out.println("BMI = "+ BMI );


    }
}
