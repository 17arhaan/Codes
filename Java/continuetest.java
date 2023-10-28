import java.util.Scanner;

public class continuetest {
public static void main(String[]args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the value of n: ");
    int n = input.nextInt();
    System.out.println("Even Numbers :-");
    for ( int i = 0 ; i <= n ; i++)
    {
        if (i%2==0) 
        {
            System.out.println(i);
        }
    } 
    input.close();
}
}
