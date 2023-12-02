
import java.util.Scanner;
import static java.lang.Math.*;
public class Newclass {
    public static int Fibonacci (int n){
        /*Recursion method Fibonacci
         *  0 1 2 3 4 5 6 7  8  9  10 ... etc
         *  0 1 1 2 3 5 8 13 21 34 55 ... etc
         * */
        if (n==0 || n==1)
            return n;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Fibonacci: "+Fibonacci(7)+" !");


    }
}
