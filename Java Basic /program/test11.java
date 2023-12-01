import java.util.Scanner;
import java.io.PrintStream ;
public class Newclass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("test yourself :");
        System.out.println("what is '5+10/2*10 = ? ' :");
        float userAnswer , theCorrectAnswer=55;
        boolean questionAnswer = false ;
        for(int i= 1 ; i<=3 ; i++) {
            userAnswer = input.nextFloat();
            if (userAnswer == theCorrectAnswer){
                questionAnswer = true ;
                break;
            }
            else if (userAnswer != theCorrectAnswer){
                if(i==3)
                    continue;
                System.out.println("chance #"+(i+1)+" : ");
            }
        }
        if(questionAnswer)
            System.out.println("Correct Answer");
        else 
            System.out.println("Wrong Answer");



    }
}
