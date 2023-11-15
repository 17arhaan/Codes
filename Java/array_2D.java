import java.util.Scanner;

public class array_2D {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int rows,columns;
        String arr[][] = new String[99][99];
        System.out.println("Enter the no. of rows: ");
        rows = input.nextInt();
        System.out.println("Enter the no. of columns: ");
        columns = input.nextInt();
        System.out.println("Enter elements:-\n");

        for(int i=0;i<rows;i++){
            for(int j =0;j<columns;j++){
                arr[i][j] = input.nextLine();
            }
        }

         for(int i=0;i<=rows;i++){
            System.out.print("\n");
            for(int j =0;j<=columns;j++){
                System.out.print(arr[i][j]);
                System.out.print("\t");
            }
        }
    }
}
