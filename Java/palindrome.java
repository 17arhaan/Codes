import java.util.Scanner;
public class palindrome 
{
public static void main(String[]args)
{
   System.out.println("Input a Number");
   Scanner sc = new Scanner(System.in);
   int a = sc.nextInt();
   int n = 0, temp = a, rem;
   while(temp != 0)
      {
         rem = temp % 10;
         n = n*10 + rem;
         temp /= 10;
      }
   if(n == a)
      {
         System.out.println("Palindrome");
      }
   else
      {
         System.out.println("Not a Palindrome");
      }
   sc.close();
}
}

