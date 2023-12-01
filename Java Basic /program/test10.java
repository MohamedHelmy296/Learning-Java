import java.util.Scanner;
import java.io.PrintStream ;
public class Newclass {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num , Sum_Even= 0 , Sum_Odd = 0;
        System.out.println("please inter 10 numbers ");
        for(int i =0 ; i < 10 ; i++)
        {
            System.out.println("number"+(i+1));
            num = input.nextInt();
            if ((num%2)==0)
                Sum_Even += num;
            else
                Sum_Odd += num;
        }
        System.out.println("sum of even numbers : "+Sum_Even);
        System.out.println("sum of odd numbers : "+Sum_Odd);






    }
}
