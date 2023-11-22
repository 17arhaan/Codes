import java.util.Scanner;

class items{
    String box;
    int apple;
    int pen;

    items(){
        System.out.println("number of items:-");
        System.out.println(this.apple = 10);
        System.out.println(this.pen = 10);
    }
}
class things{
    public static void main(String[] args) {
        items color = new items();

        color.box = "Red";;
        System.out.println("Box Color: "+color.box);
    }
}