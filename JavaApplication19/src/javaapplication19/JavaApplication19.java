package javaapplication19;
import java.util.Scanner;
public class JavaApplication19
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the Number up to : ");
        int input = scan.nextInt();
        System.out.println("Multiplication Table from 1 to "+ input);
        table(input);
        
    }
    public static void table(int input)
    {
        int num1=1,num2,result;
        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=input;j++)
            {
                num2=j;
                result=num1*num2;
                System.out.print(num1+"x"+num2+"="+result+"  ");
            }
            System.out.println("");
            num1++;
        }
    }
}





/*;*/