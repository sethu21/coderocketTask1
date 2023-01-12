import java.util.Arrays;
import java.util.Scanner;

public class SPEED {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a distance in meter =  ");
        float meter = scanner.nextFloat();


        System.out.println("input hour = " );
        float Hour = scanner.nextFloat();


        System.out.println("input minutes = ");
        float Minutes = scanner.nextFloat();

        System.out.println("input second =  " );
        float Second = scanner.nextFloat();

        float Time = ( Hour * 3600)+(Minutes*60)+ Second;
        float MeterSec = meter/Time;
        System.out.println("your speed in meter/sec = "+MeterSec);

        float KiloMeter = (meter*3600)/(Time*1000);
        System.out.println("Your speed in kilo  meter = "+ KiloMeter );

        float Miles = KiloMeter/1.609f;
        System.out.println("your speed in miles = "+ Miles);





    }
}
