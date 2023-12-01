import java.util.Scanner;
import java.io.PrintStream ;
public class Newclass {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num ;
        do {
            int factorial = 1;
            System.out.println("Enter any number to get his factorial and 0 to end program ");
            num = input.nextInt();
            for (int i = 1; i <= num; i++) {
                factorial = factorial * i;
            }
            System.out.println("factorial of " + num + " = " + factorial);
        }while ( num != 0);



    }
}
