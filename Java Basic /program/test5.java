import java.util.Scanner;
import java.io.PrintStream ;
public class Newclass {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter your operation: * / + - % ");
        char operator = input.next().charAt(0);
        int number1;
        int number2;
        System.out.println("please enter number one :");
        number1 = input.nextInt();
        System.out.println("please enter number two:");
        number2 = input.nextInt();
        switch (operator){
            case '*':
                System.out.printf("%d * %d = %d",number1,number2,(number1*number2));
                break;
            case '/':
                System.out.printf("%d / %d = %d",number1,number2,(number1/number2));
                break;
            case '+':
                System.out.printf("%d + %d = %d",number1,number2,(number1+number2));
                break;
            case '-':
                System.out.printf("%d - %d = %d",number1,number2,(number1-number2));
                break;
            case '%':
                System.out.printf("result = %d",(number1%number2));
                break;
            default:
                 System.out.printf("invalied operator");

            


        }


    }
}
