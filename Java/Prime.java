import java.util.*;
public class Prime {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the maximum to search for prime numbers: ");
        int n = input.nextInt();
        int[] a = new int[n]; 
        System.out.println("Prime Numbers are :-");
        for ( int i = 0 ; i < n ; i++)
        {
            for(int j=2; j<i; j++)
            {
                if(i % j != 0){

                    
                }
            }
        }
        input.close();
    }   
}
