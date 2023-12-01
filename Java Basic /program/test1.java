import java.util.Scanner;
public class Newclass
{
    public static void main (String[]args)   //This is the entry point of the program
    {
      Scanner input = new Scanner(System.in);
      String fname="";
      float salary;
      float net_salary;
      
      System.out.println("Enter your first name");
      fname = input.nextline();
      System.out.print("your name is : "+fname);

      
      System.out.println("Enter your salary");
      salary = input.nextFloat();
      
      net_salary = salary - (salary * 0.10f); // f to tell is 0.10 is float

      System.out.printf("Your Net salary is %f",net_salary);
      
    }
}
