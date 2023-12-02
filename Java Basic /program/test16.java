import java.util.Scanner;
import static java.lang.Math.*;
public class Newclass {
    public static int sum(int n1 ,int n2){
        if (n1 == n2)
            return n1 ;
        else{
          if(n1 < n2)
            return n1 + sum(n1+1 , n2);
          else
            return n1 + sum(n1-1 , n2);
        }
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("The sum of numbers between(0,10)is: "+sum(0,10)+" !"); 
         // can use math to solve this problem
        // sum = (upper - lower + 1 ) * (lower + upper) / 2 ; 

    }
}
