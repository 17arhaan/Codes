import java.util.*;
import java.util.Scanner;

public class month_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int array[] = new int[99];
        System.out.println("Enter the length of array: ");
        int n = input.nextInt();
        System.out.println("Enter the values in array");
        for(int i=0;i<n;i++){
            array[i] = input.nextInt();
        }
        System.err.print("Array :-\n[ ");
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
            System.out.print(" ");
        }
        System.out.print("]");
        System.err.println("\n");
        if (array[n] == 10){
            System.out.println("Elements in array are equal to 10");
        }
        else{
            System.out.println("Elements in array are not equal to 10");
        }
    }
}
