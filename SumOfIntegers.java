import java.util.Scanner;
public class SumOfIntegers {
        public static void main(String[] args){
            Scanner input=new Scanner(System.in);
            System.out.print("Input a integer between 0 to 1000: ");
            int total=input.nextInt();
            int sum=0;
            while(total!=0)
            {
                sum=sum+(total%10);
                total=total/10;
            }
            System.out.println(sum);
        }
    }

