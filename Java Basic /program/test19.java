/* Arrays (one-Dimensional Arrays)
* Write a java program to find the maximum and minimum value of an array.
*  */
import java.util.Scanner;
//import static java.lang.Math.*;
public class Newclass {
    public static void main(String []args){
        //Scanner in = new Scanner(System.in);
        int []array={5,2,6,-6,-8,0,20};
        int min = array[0];
        int max = array[0];
        for(int i:array)
        {
            if(i< min)
                min = i;
        }
        for(int j:array)
        {
            if(j > max)
                max = j;
        }
        System.out.println("the min is : "+min);
        System.out.println("the max is : "+max);




    }
}
