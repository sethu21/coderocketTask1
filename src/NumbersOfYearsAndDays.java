import java.util.Scanner;

public class NumbersOfYearsAndDays {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a min : ");
        int min = input.nextInt();
        int year = min/ (60 * 24 * 365);
        System.out.printf(year +"years");
        int day = min - (year*(60*24*365));
        int days = day/(60*24);
        System.out.printf(days+"days");

    }
}
