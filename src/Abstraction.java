abstract class Vehicles1{

    String model;

    abstract void startEngine();

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}

class Cars1 extends Vehicles1{

    void startEngine(){
        System.out.println("Car Engine Started");
    }
}

class Motorcycles1 extends Vehicles1{

    void startEngine(){
        System.out.println("Motorcycle Engine Started");
    }
}

class Trucks1 extends Vehicles1{

    void startEngine(){
        System.out.println("Truck Engine Started");
    }
}


abstract class Vehicles2{

    abstract void start();

    public void stop(){
        System.out.println("Vehicle Stop");
    }
}

class Cars2 extends Vehicles2{

    public void start(){
        System.out.println("Car Started");
    }
}

class Bikes2 extends Vehicles2{

    public void start(){
        System.out.println("Bike Started");
    }
}

abstract class Shapes2{

    abstract double calculateArea();

    abstract double calculatePerimeter();

    public void displayShape(){
        System.out.println("This is the shape");
    }
}

class Traingles1 extends Shapes2{

    private double side1;
    private double side2;
    private double side3;

    public Traingles1(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea(){
        double a = (side1 + side2 + side3) / 2 ;
        return Math.sqrt(a * (a - side1) * (a - side2) * (a - side3));
    }

    public double calculatePerimeter(){
        return (side1 + side2 + side3);
    }
}

public class Abstraction {

    public static void main(String[] args) {

        Vehicles1 cars1 = new Cars1();
        cars1.setModel("BMW");
        System.out.println(cars1.getModel());
        cars1.startEngine();

        System.out.println("------------------------------------------------");

        Vehicles1 motorcycle1 = new Motorcycles1();
        motorcycle1.setModel("Ford");
        System.out.println(motorcycle1.getModel());
        motorcycle1.startEngine();

        System.out.println("------------------------------------------------");

        Vehicles1 trucks1 = new Trucks1();
        trucks1.setModel("HONDA");
        System.out.println(trucks1.getModel());
        trucks1.startEngine();

        System.out.println("------------------------------------------------");

        System.out.println("******************************************");

        Vehicles2 cars2 = new Cars2();
        cars2.start();
        cars2.stop();

        Vehicles2 bikes2 = new Bikes2();
        bikes2.start();
        bikes2.stop();

        Shapes2 traingles1 = new Traingles1(50.89,45.89,67.99);
        System.out.println("Area is      : "  + traingles1.calculateArea() + "cm^2");
        System.out.println("Perimeter is : "  + traingles1.calculatePerimeter() + "cm");
    }
}
