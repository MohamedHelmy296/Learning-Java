/* Arrays (one-Dimensional Arrays)
* Write a java program to test if an array contains value.
*  */
import java.util.Scanner;
import static java.lang.Math.*;
public class Newclass {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int []array={1,3,5,7,9,11,13};
        System.out.println("please enter number to search in array : ");
        int num = in.nextInt();
        boolean flag = false;
        for (int i = 0 ; i < array.length ; i++)
        {
            if(array[i] == num){
                flag = true;
                break;
            }
        }
        if (flag)
            System.out.println("found");
        else
            System.out.println("Not found");


    }
}
