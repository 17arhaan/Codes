import java.util.Scanner;
public class array_1D{
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        int n;
        String arr[] = new String[99];
        System.out.println("Enter the no. of elements: ");
        n = input.nextInt();
        System.err.println("Enter the elements:- ");
        for(int i=0;i<=n;i++){
            arr[i] = input.nextLine();
        }
        for (int j=0;j<=n;j++){
            System.out.println(arr[j]);
        }
    }
}
