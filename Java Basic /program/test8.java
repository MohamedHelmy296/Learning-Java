import java.util.Scanner;
import java.io.PrintStream ;
public class Newclass {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("enter positive number :");
            num = input.nextInt();
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " * " + i + " = " + (num * i));
                }
        }while (num > 1 );

    }
}
