/* Arrays (one-Dimensional Arrays)
* Write a java program to sum values of an array.
*  */
import java.util.Scanner;
import static java.lang.Math.*;
public class Newclass {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int []array={1,5,8,9};
        //way 1
        int sum = 0 ;
        for (int i:array)
            sum += i ;
        System.out.println("the avg1 = "+sum/array.length);
        //way 2
        sum=0;
        for (int j = 0 ; j < array.length ; j++)
        {
            sum += array[j];
        }
        System.out.println("the sum2 : "+sum/array.length);

    }
}
