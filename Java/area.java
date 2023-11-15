import java.util.Scanner;
import java.math.*;

class parameterz{
    int length;
    int width;
    int side;
    int radius;
}

public class area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        parameterz triangle = new parameterz();
        parameterz rectangle = new parameterz();
        parameterz square = new parameterz();
        parameterz circle = new parameterz();

        System.out.println("Enter the length and width of triangle: ");
        triangle.length = input.nextInt();
        triangle.width = input.nextInt();

        System.out.println("Enter the length and width of rectangle: ");
        rectangle.length = input.nextInt();
        rectangle.width = input.nextInt();

        System.out.println("Enter the side of square: ");
        square.side = input.nextInt();
 
        System.out.println("Enter the radius of circle: ");
        circle.radius = input.nextInt();

        int area_rect = rectangle.length * rectangle.width;
        float area_tri = (triangle.length * triangle.width)/2;
        int area_sqr = square.side * square.side;
        double area_circ = Math.PI * circle.radius * circle.radius;

        isDisplay(area_rect,area_tri,area_sqr,area_circ);
        
        input.close();
    }
    static void isDisplay(int areaR , float areaT , int areaS , double areaC){
        System.out.println("Areas of figures are:- ");
        System.out.print("Area of rectangle: ");
        System.out.println(areaR);
        System.out.print("Area of triangle: ");
        System.out.println(areaT);
        System.out.print("Area of square: ");
        System.out.println(areaS);
        System.out.print("Area of circle: ");
        System.out.println(areaC);
    }
}

