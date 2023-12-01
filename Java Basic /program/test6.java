import java.util.Scanner;
import java.io.PrintStream ;
public class Newclass {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        char operator;
        do {
            System.out.println("number_1 :");
            number1 = input.nextInt();
            System.out.println("number_2 :");
            number2 = input.nextInt();
            System.out.println("please enter your operation: * / + - %  any other key to end program");
            operator = input.next().charAt(0);
            switch (operator) {
                case '*':
                    System.out.printf("%d * %d = %d \n", number1, number2, (number1 * number2));
                    break;
                case '/':
                    System.out.printf("%d / %d = %d \n", number1, number2, (number1 / number2));
                    break;
                case '+':
                    System.out.printf("%d + %d = %d \n", number1, number2, (number1 + number2));
                    break;
                case '-':
                    System.out.printf("%d - %d = %d \n", number1, number2, (number1 - number2));
                    break;
                case '%':
                    System.out.printf("result = %d \n", (number1 % number2));
                    break;
            }
        }while(operator == '*' || operator == '-' || operator == '+' || operator == '/' || operator == '%' );


    }
}
