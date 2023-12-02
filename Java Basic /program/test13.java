/* Write a java method to compute the average of three numbers */
import java.util.Scanner;
public class Newclass {
    static float average (float n1 , float n2 , float n3){
        float sum = n1 + n2 + n3;
        return (sum / 3); // or (n1+n2+n3)/3
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number#1");
        float num1 = in.nextFloat();
        System.out.println("Enter number#2");
        float num2 = in.nextFloat();
        System.out.println("Enter number#3");
        float num3 = in.nextFloat();
        System.out.println("the avg is :"+average(num1,num2,num3));


    }
}

////////////////////////  for(int i:n) 
import java.util.Scanner;
public class Newclass {
    public static int sum (int...n){ // n is an array
        int s = 0 ;
        for(int i:n)  //loop
            s += i;
        return s;
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("sum = "+sum(1,2,2,5,8,10)); //any number of parameter



    }
}
