import java.util.Scanner;
import java.io.PrintStream ;
public class Newclass {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter how many number you need to sum it:");
        int n = input.nextInt();
        float number=0 , sum=0 ;
        for (int i = 1 ; i <= n ; i++ )
        {
            System.out.printf("number%d:",i);
            number = input.nextFloat();
            sum = sum + number;
        }
        System.out.println("the sum = "+sum);


    }
}
