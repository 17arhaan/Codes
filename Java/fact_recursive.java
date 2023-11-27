import java.util.*;
import java.util.Scanner;
class fact_recursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int numbr = input.nextInt();
        int result;
        result = isFact(numbr);
        System.out.println("The factorial of "+numbr+" is "+result+".");
    }
    static int isFact(int num){
        int result;
        if(num ==1){
            return 1;
        }
        result = isFact(num-1) * num;
        return result;
    }
}
