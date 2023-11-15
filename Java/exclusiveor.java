import java.util.Scanner;
public class exclusiveor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the value of number 1: ");
        num1 = input.nextInt();
        System.out.println("Enter the value of number 2: ");
        num2 = input.nextInt();
        isOr(num1, num2);
        
    }
    public static int isOr(int num1,int num2){
        // if(num1 ^= num2){
        if(num1 != num2){
            System.out.println("They are not equal");
        }
        else{
            System.out.println("They are equal ");
        }
        return 0;
    }
}
