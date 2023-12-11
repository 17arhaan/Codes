import java.util.*;

class superclass{
    // String name[] = new String[20];
    // int[] roll_no = new int[20];
    // int[] semester = new int[20]; 
    static String name;
    static int roll_no;
    static int semester;
    superclass(String name,int rollno,int sem){
        this.name = name;
        this.roll_no = rollno;
        this.semester = sem;
    }
}

public class subclass extends superclass {    
    public static void main(String[] args) {
        System.out.println("Details :-");
        name = "Arhaan";
        roll_no = 16;
        semester = 3;        
        System.out.println("Name ---> "+name);
        System.out.println("Roll No. --> "+roll_no);
        System.out.println("Semester --> "+semester);
    }
    subclass(String name, int rollno, int sem) {
        super(name, rollno, sem);   
        this.name = name;
        this.semester = sem;
        this.roll_no = rollno;
    }   
}
