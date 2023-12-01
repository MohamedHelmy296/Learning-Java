import java.util.Scanner;
    public class Newclass{ //should the class name (Newclass be the same name of the name of file defined in 
    public static void main (String args[]){   //This is the entry point of the program
        Scanner input = new Scanner(System.in);
        int testNumber ;
        System.out.println("please enter the number to test it: ");
        testNumber = input.nextInt();
        if(testNumber>0) {
            System.out.printf("Number %d is positive \n", testNumber);
        }
            else {
            System.out.printf("Number %d is negative \n", testNumber);
        }

    }

}
