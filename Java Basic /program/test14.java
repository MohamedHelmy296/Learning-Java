/*Recursion method factorial*/
import java.util.Scanner;
import static java.lang.Math.*;
public class Newclass {
    public static int factorial(int n){
        if (n==1 || n==0 )
            return n;
        else
            return (n*factorial(n-1));
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("fac = "+factorial(5));



    }
}
/* return n * factorial(n-1);
          5 * factorial(4) // 120
              4 * factorial(3) // 24
                  3 * factorial(2) // 6
                      2 * factorial(1) // 2
                          1 //1
 */
