import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner User = new Scanner(System.in);
        System.out.print("input six non-negative digits= " );
        int Input = User.nextInt();
        if (Input > 999999){
            return  ;

        }
        else if (Input > 0){
            int digit1=Input/100000%10;
            int digit2=Input/10000%10;
            int digit3=Input/1000%10;
            int digit4=Input/100%10;
            int digit5=Input/10%10;
            int digit6=Input%10;
            System.out.print( digit1+" "+digit2+" "+digit3+" "+digit4+" "+digit5+" "+digit6 );
        }
        else  {
            return;
        }

    }
}
