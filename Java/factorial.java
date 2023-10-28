import java.util.Scanner;

public class factorial 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial: ");
        int num = input.nextInt();
        input.close();
        int fact;
        fact = isCalculate(num);
        System.out.println("The factorial of "+ num +" is " + fact);
    }

        public static int isCalculate(int x)
        {
            int fact = 1;
            for ( int i = 1 ; i <= x ; i++)
            {
                fact = fact * i;
            }
            return fact;
        }
}
