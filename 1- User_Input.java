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

/********************************************************************************************************************************
*********************************************************************************************************************************
*********************************************************************************************************************************
*********************************************************************************************************************************/

import java.util.Scanner; //include 
public class Newclass
{
    //This is the entry point of the program
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in); //define object name (input) to use it getting from user 
        String fname="";
        float salary;
        float net_salary;
            System.out.println("Enter your first name");
            fname = input.next();

            System.out.println("Enter your salary");
            salary = input.nextFloat();

            net_salary = salary - (salary * 0.10f); // f to tell is 0.10 is float

            System.out.printf("Your Net salary is %f",net_salary);
            
    }
}
/*
- Scanner M = new Scanner(System.in); 

- import java.util.Scanner;

- System.out.print("   "+ );

- System.out.println("   "+ );    // new line after finish 

- System.out.printf("   %d ", );  

d : [byte , short , int , long ] 
f : [float , double]
C , c : [char]
S , s : [string]
n : newline

*/

// String s = in.next();     مع اول مسافه هيوقف قراءه 
// String s = in.nextline();  هياخد كل حاجه بالمسافات 
// char s = in.next().charAt(0); دا بس  line كدا بقوله عاوز الحرف الاول من ال

/*
methods 
    in.nextBoolean()
    in.nextByte()
    in.nextShort()
    in.nextInt()
    in.nextLong()
    in.nextFloat()
    in.nextDouble()
    in.next()
    in.nextline()
    in.next().charAt();


    */
