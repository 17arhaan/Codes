import java.util.*;
import java.util.Scanner;

public class betterStack {
    int max_size;
    int stack[] = new int[10];
    int tos;

    betterStack(){
        tos = -1;
    }

    void push(int element){
        if (tos == 9){
            System.out.println("Stack is full");
        }
        else{
            stack[++tos] = element;
        }
    }

    int pop(){
        if(tos<0){
            System.out.println("Underflow");
            return 0;
        }
        else{
            return stack[tos--];
        }
    }
    public static void main(String[] args) {
    }
}
