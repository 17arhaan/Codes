import java.util.*;
public class stringfxs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String string1 = input.next();
        System.out.print("Enter string 2 : ");
        String string2 = input.next();

        System.out.println("Length 1: "+string1.length() +" "+"Length 2: "+ string2.length());
        System.out.println("Index 1: "+string1.indexOf("r"));
        System.out.println("Index 2: "+string2.indexOf("r"));
        String sub1 = string1.substring(2, 4);
        String sub2 = string2.substring(2, 4);
        if (string1.compareTo("xyz") < 0){
            System.out.println("true");
        } else {
            System.out.println("False");
        }
        System.out.println(sub1);
        // System.out.println(sub2);
        // String string[] = new String[50];
        // System.out.print("Enter the length of string: ");
        // int n = input.nextInt();
        // System.out.print("Enter array elements: ");
        // for(int i = 1 ; i<= n ; i++){
        //     string[i] = input.next();
        // }
        String string[] = {"Hi","my","name","is","arhaan"};
        for (String s : string)
            System.out.print(s + " ");
    }
}
