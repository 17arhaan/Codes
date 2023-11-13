import java.util.Scanner;
public class pattern {
    public static void main(String[]args)
    {   
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of Iterations: ");
        int n = input.nextInt();
        int count = 1;
        for (int i = n ; i > 0 ; i --)
        {
            for (int j = 0 ; j < i-1; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0 ; j < count ; j++)
            {
                System.out.print("*");
            }
            count++;
            System.out.println("");
        }
    }
}
