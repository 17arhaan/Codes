import java.util.*;

public class squaresum
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = input.nextInt();
        int sum = 0;
        int sqr = 0;
        for (int i = 0 ; i <=n ; i++)
        {
            sqr = i*i;
            System.out.println("The square of " + i + " is " + sqr);
            sum = sum + sqr;
        }
        System.out.println("The total of sum of square of " + n + " terms " +"is " + sum );
        input.close();
    }
}