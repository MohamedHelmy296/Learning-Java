/*
* write a java program to calculate grade of student,
* if percentage >= 90 print A grade ,
* if percentage >= 80 print B grade ,
* if percentage >= 70 print C grade ,
* if percentage >= 60 print D grade ,
* otherwise print fail.
* */
import java.util.Scanner;

public class Newclass {
    public static void main(String []arg){
        Scanner in = new Scanner(System.in);
        int grade ;
        System.out.println("please enter your grade: ");
        grade = in.nextInt();
        if ((grade <= 100) && (grade >= 90) )
        {
            System.out.println("grade A \n");
        }
        else if ((grade <90) && (grade >= 80) )
        {
            System.out.println("grade B \n");
        }
        else if ((grade <80) && (grade >= 70) )
        {
            System.out.println("grade C \n");
        }
        else if ((grade <70) && (grade >= 60) )
        {
            System.out.println("grade D \n");
        }
        else{
            if(grade > 100)
            System.out.println("invaled grade \n");
            else
            System.out.println("fail \n");
        }

    }
}
