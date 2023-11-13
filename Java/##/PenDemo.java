class Pen{
    public String type;
    public String color;
    public String brand;
    public int amount;
}
public class PenDemo{
    public static void main(String[] args) {

        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        Pen pen3 = new Pen();

        pen1.type = " Ball Pen ";
        pen2.type = " Gel Pen ";
        pen3.type = " Fountain Pen ";

        pen1.color = " Red ";
        pen2.color = " Black ";
        pen3.color = " Blue ";

        pen1.brand = " Reynolds ";
        pen2.brand = " Pilot ";
        pen3.brand = " Parker ";

        pen1.amount = 16;
        pen2.amount = 12;
        pen3.amount = 10;

        isDisplay(pen1,pen2,pen3);
    }    
    public static void isDisplay(Pen pen1, Pen pen2, Pen pen3)
    {

        System.out.println(" ");
        System.out.println("Amount of Pens :- ");
        System.out.println(" Pen 1 : "+pen1.amount);
        System.out.println(" Pen 2 : "+pen2.amount);
        System.out.println(" Pen 3 : "+pen3.amount);
        System.out.println(" ");
        System.out.println("Brand of Pens :- ");
        System.out.println(" Pen 1 : "+pen1.brand);
        System.out.println(" Pen 2 : "+pen2.brand);
        System.out.println(" Pen 3 : "+pen3.brand);
        System.out.println(" ");
        System.out.println("Colors of Pens :- ");
        System.out.println(" Pen 1 : "+pen1.color);
        System.out.println(" Pen 2 : "+pen2.color);
        System.out.println(" Pen 3 : "+pen3.color);
        System.out.println(" ");
        System.out.println("Type of Pens :- ");
        System.out.println(" Pen 1 : "+pen1.type);
        System.out.println(" Pen 2 : "+pen2.type);
        System.out.println(" Pen 3 : "+pen3.type);
        System.out.println(" ");
        
    }
}