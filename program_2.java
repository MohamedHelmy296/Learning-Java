import java.util.Scanner;
public class Newclass
{
    //This is the entry point of the program
    public static void main (String[]args)
    {
        Scanner input = new Scanner(System.in);
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
