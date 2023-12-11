public class innerclass {
    public static void main(String[] args) {
        int x_val;
        adjust(x_val = 50);
        System.out.println((x_val));
    }
    static void adjust(int x){
        Outer object = new Outer();
        object.x = 50;
    }
}
class Outer
{
    int x = 100;
    class Inner 
    {
        int x = 50;
    }
}

