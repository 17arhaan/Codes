// count the number of digits //
import java.util.Scanner;

class digits {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter the number : ");
        int n = input.nextInt();
        System.out.println("The number is : " + n);

        int count = countz(n);
        System.out.println("Number of digits : "+count);
    }
    static int countz(int n)
    {
        int count = 0;

        do {
            count++;
            n = n/10;
        }
        while( n!=0);
        return count;
    }
}