/* Arrays (one-Dimensional Arrays)
* Write a java program to sort a numeric array.
*  */
import java.util.Arrays;
//import java.util.Scanner;
//import static java.lang.Math.*;
public class Newclass {
    public static void main(String []args){
        //Scanner in = new Scanner(System.in);
        int []array={9, 8, 1, 25, 0, -1};
        Arrays.sort(array);
        for(int i : array){
            System.out.print(i+" ");
        }


        
    }
}
