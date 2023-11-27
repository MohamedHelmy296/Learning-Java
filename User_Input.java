//to get input from the user
import java.util.Scanner;   //like include the package have Scanner function
public class Newclass
{
    //This is the entry point of the program
    public static void main (String[]args)
    {
        //accept input from the user
        Scanner in = new Scanner(System.in); //create object name (in) to use it to get input from user 
        int length, width, area ;  //variables to save the value getting from the user in it
        System.out.println("Enter rectangle length"); 
        length = in.nextInt(); //get the value by function'nextInt'by(in)object and store it in length
        System.out.println("Enter rectangle Width");
        width = in.nextInt(); //get the value by (in)object and store it in width
        area = length * width ;
        System.out.print("area = " + area); // or use print format -->    System.out.printf("area = %d",area);
        //or
        System.out.printf("area = %d",area);
    }
}
