import java.util.Scanner;
import java.util.*;

class palindromecheck 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.err.println("Enter a number to check: ");
        int num = input.nextInt();
        int temp = num;
        int n=0;
        int remainder;
        while(num!=0)
        {
        remainder = temp %10;
        n = n*10 + remainder;
        temp /= 10;
        }
        if(n == num)
        {
            System.out.println("It is a palindrome");
        }
        else
        {
            System.out.println("It is not a palindrome");
        }
        input.close();
    }
}
