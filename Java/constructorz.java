import java.util.Scanner;

public class constructorz {
        
        Scanner input = new Scanner(System.in);
        String name;
        
        public constructorz(String name){

            this.name = name;
            System.out.println(name);
            System.out.println("Enter your name: ");
            name = input.next();
        }
        public static void main(String[] args) {
                System.out.println("Hello");
        }
}
