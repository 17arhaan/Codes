import java.util.*;
class modifier{
    int a;
    public int b;
    private int c;
    void setc(int i){
        c = 1;
    }
    int getc(){
        return c;
    }
    static void method(int i , int j , int k){
        i = i *2;
        j = j /2;
        k = k + i + j;
    }
}
public class access extends modifier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        modifier object = new modifier();
        System.out.print("Enter the value of a: ");
        object.a = input.nextInt();
        System.out.print("Enter the value of b: ");
        object.b = input.nextInt();
        System.out.print("Enter the value of c: ");
        int c_val= input.nextInt();
        object.setc(c_val);
        System.out.println("---- Before Call ----");
        System.out.println("the values of a , b and c are : "+object.a+" "+object.b+" and "+object.getc()+" respectively. ");
        modifier.method(object.a,object.b,c_val);
        System.out.println("----- After Call -----");
        System.out.println("the values of a , b and c are : "+object.a+" "+object.b+" and "+object.getc()+" respectively. ");
        String nme = "Arhaan";
        access.method(nme);
        System.out.println(nme);
    }
    static void method(String name){
        name = " arhaan";
    }   
}
