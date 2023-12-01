import java.util.Scanner;
    public class Newclass{ //should the class be the same name of the name of file defined in
    public static void main (String args[]){   //This is the entry point of the program
        Scanner input = new Scanner(System.in);
        int test_Number ;
        System.out.println("please enter the number to test it: ");
        test_Number = input.nextInt();
        if (0 <= test_Number) {
            if ((test_Number % 2) == 0) {
                System.out.printf("Number %d is even \n", test_Number);
            } else {
                System.out.printf("Number %d is odd \n", test_Number);
            }
        }
        else {
            System.out.print("the number should be positive");
        }
    }

}






