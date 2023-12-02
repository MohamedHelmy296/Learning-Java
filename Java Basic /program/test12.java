/* Write a java method to find the smallest number among three numbers */
import java.util.Scanner;
public class Newclass {
    static int SmallestNumber (int num1, int num2 , int num3 ){
        int minNumber = num1;
        if (minNumber > num2)
            minNumber = num2;
        if (minNumber>num3)
            minNumber= num3;
        return minNumber;
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter enter 3 numbers");
        System.out.println("number#1");
        int n1= in.nextInt();
        System.out.println("number#2");
        int n2= in.nextInt();
        System.out.println("number#3");
        int n3= in.nextInt();
        System.out.println("the smallest number is :"+SmallestNumber(n1,n2,n3));

    }
}
