import java.util.Scanner;

public class addition 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number to add: ");
        int a = sc.nextInt();
        System.out.println("Enter second number to add: ");
        int b = sc.nextInt();
        int sum = a + b;
        isSum(a,b,sum);
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
    public static int isSum(int x , int y , int z){
        z = x + y;
        return z;
    }
}
