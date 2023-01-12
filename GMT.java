import java.util.Arrays;
import java.util.Scanner;

public class GMT {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the time zone offset to GMT: ");
        int time = input.nextInt();
        long millisecond = System.currentTimeMillis();
        long second = millisecond/1000;
        long TotalSecond = second%60;
        long minute = second/60;
        long TotalMinute = minute%60;
        long hours = TotalMinute/60;
        long TotalHours = ((hours + time)%24);
        long CurrentTime = TotalHours ;


        System.out.printf("Current time is :"+CurrentTime +":"+TotalMinute+":"+TotalSecond);

    }
}
