import java.util.*;
public class arrayofstrings {
    public static void main(String[] args) {

        String array[][] = new String[50][50];
        int rows , columns;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no. of rows and columns respectively:");
        rows = input.nextInt();
        columns = input.nextInt();
        for(int i = 1 ; i<=rows ; i++){
            for (int j = 1 ; j<=columns ; j++){
                System.out.print("Enter element["+i+"]["+j+"] :");
                array[i][j] = input.next();
            }
        }                
        System.out.print("\nArray is :-");
        for(int i = 1 ; i<=rows ; i++){
            System.out.print("\n");
            for (int j = 1 ; j<=columns ; j++){
            System.out.print(array[i][j]);                
            System.out.print("\t");
            }
        }

        System.out.println("\n"+array.length);
        System.out.println(array[2].length);
    }
} 