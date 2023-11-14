//to get input from user
import java.util.Scanner;
public class Newclass
{
    //This is the entry point of the program
    public static void main (String[]args)
    {
        //accrpt input from user
        Scanner input = new Scanner(System.in);
        int length , width , area ;
        System.out.println("Enter rectangle length");
        length = input.nextInt();
        System.out.println("Enter rectangle Width");
        width = input.nextInt();
        area = length * width ;
        System.out.print("area = " + area); // or use print format -->    System.out.printf("area = %d",area);
        //or
        System.out.printf("area = %d",area);
    }
}
