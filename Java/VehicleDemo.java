public class VehicleDemo {  
        public static class Vehicle {
        String type;
        String model;
        int top_speed;
    }
public static void main(String[]args) {
        Vehicle X_Series = new Vehicle();
        Vehicle Camry = new Vehicle();
        Vehicle Fortuner = new Vehicle();

        X_Series.type = "SUV";
        Camry.type = "Sedan";
        Fortuner.type = "SUV";

        X_Series.model = "v7";
        Camry.model = "v5";
        Fortuner.model = "v6";

        X_Series.top_speed = 300;
        Camry.top_speed = 250;
        Fortuner.top_speed = 200;
        
        System.out.println("");
        System.out.println("X_Series Details :- ");
        System.out.println("1. Model = "+ X_Series.model);
        System.out.println("2. Type = "+ X_Series.type);
        System.out.println("3. Top Speed = "+ X_Series.top_speed);
        System.out.println("");
        System.out.println("Camry Details :- ");
        System.out.println("1. Model = "+ Camry.model);
        System.out.println("2. Type = "+ Camry.type);
        System.out.println("3. Top Speed = "+ Camry.top_speed);
        System.out.println("");
        System.out.println("Fortuner Details :- ");
        System.out.println("1. Model = "+ Fortuner.model);
        System.out.println("2. Type = "+ Fortuner.type);
        System.out.println("3. Top Speed = "+ Fortuner.top_speed);
        System.out.println("");
    }
}
