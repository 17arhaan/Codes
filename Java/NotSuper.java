abstract class NotsoSuper{
    protected static int x ;
    static int getX(){
        return x;
    }
}
public class NotSuper extends NotsoSuper {
    public static void main(String[] args) {
        System.out.println("Default Code");
        setX(100);
        System.out.println(getX());
        final int y = 100;
        System.out.println(y);
    }
    static void setX(int i) {
        x = i;
    } 
}