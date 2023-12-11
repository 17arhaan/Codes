interface Series {
    interface Series1 {
        interface Series2 {
            static int wow(int x){
                System.out.println(x);
                return x;
            }
        }

    };
}
class B implements Series.Series1.Series2{
    int wow(int x){
        System.out.println(x);
                return x;
    }
}
public class Seriess{
    public static void main(String[] args) {
        int y = 100;
        Series.Series1.Series2 obj = new B();
    }
}
