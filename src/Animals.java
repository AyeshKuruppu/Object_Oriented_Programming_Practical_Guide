class Animal {

    String name;
    int age;

    public Animal(String name,int age){
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal{

    String breed;

    public Dog(String name,int age,String breed){
        super(name,age);
        this.breed = breed;
    }

    public String description(){
        return name + " is a " + age + " years old " + breed + " Dog";
    }
}

class Cat extends Animal{

    String color;

    public Cat(String name,int age,String color){
        super(name,age);
        this.color = color;
    }

    public String description(){
        return name + " is a " + age + " years old " + color + " Cat";
    }
}

class Vehicle{

    protected String make;
    protected String model;

    public Vehicle(String make,String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return make;
    }

    public String getModel(){
        return model;
    }
}

class Car extends Vehicle{

    private int noOfDoors;

    public Car(String make,String model,int noOfDoors){
        super(make,model);
        this.noOfDoors = noOfDoors;
    }

    public void displayCarInfo(){
        System.out.println("Car Make    : " + this.make);
        System.out.println("Car Model   : " + this.model);
        System.out.println("No Of Doors : " + this.noOfDoors);
    }
}

class Truck extends Vehicle{

    private double payLoad_Capacity;

    public Truck(String make,String model,double payLoadCapacity){
        super(make,model);
        this.payLoad_Capacity = payLoadCapacity;
    }

    public void displayTruckInfo(){
        System.out.println("Car Make    : " + this.make);
        System.out.println("Car Model   : " + this.model);
        System.out.println("PayLoad Capacity : " + this.payLoad_Capacity);
    }
}

class Book{

    protected String title;
    protected String author;
    protected String ISBN;

    public Book(String title,String author,String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void displayBookDetails(){
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("ISBN   : " + this.ISBN);
    }
}

class Ebook extends Book{

    private String fileSize;

    public Ebook(String title,String author,String ISBN,String fileSize){
        super(title,author,ISBN);
        this.fileSize = fileSize;
    }

    public void displayEbookDetails(){
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("ISBN   : " + this.ISBN);
        System.out.println("File Size   : " + this.fileSize);
    }
}

class PrintedBook extends Book{

    private int noOfPages;

    public PrintedBook(String title,String author,String ISBN,int noOfPages){
        super(title,author,ISBN);
        this.noOfPages = noOfPages;
    }

    public void displayPrintedBookDetails(){
        System.out.println("Title  : " + this.title);
        System.out.println("Author : " + this.author);
        System.out.println("ISBN   : " + this.ISBN);
        System.out.println("No Of Pages : " + this.noOfPages);
    }
}

class Employee{

    protected String employeeName;
    protected String employeeID;

    public Employee(String employeeName,String employeeID){
        this.employeeName = employeeName;
        this.employeeID = employeeID;
    }

    public String getEmployeeName(){
        return employeeName;
    }

    public String getEmployeeID(){
        return employeeID;
    }
}

class FullTimeEmployee extends Employee{

    private double Salary;

    public FullTimeEmployee(String employeeName,String employeeID,double Salary){
        super(employeeName,employeeID);
        this.Salary = Salary;
    }

    public void displayFullTimeEmployeeDetails(){
        System.out.println("Employee Name " + this.employeeName);
        System.out.println("Employee ID " + this.employeeID);
        System.out.println("Employee Salary " + this.Salary);
    }
}

class PartTimeEmployees extends Employee{

    private String  hourRate;

    public PartTimeEmployees(String employeeName,String employeeID, String hourRate){
        super(employeeName,employeeID);
        this.hourRate = hourRate;
    }

    public void displayPartTimeEmployeeDetails() {
        System.out.println("Employee Name " + this.employeeName);
        System.out.println("Employee ID " + this.employeeID);
        System.out.println("Employee hour rate " + this.hourRate);
    }
}

class Shape{

    protected String color;

    public Shape(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }
}

class Circle extends Shape{

    private double radius;

    public Circle(String color,double radius){
        super(color);
        this.radius = radius;
    }

    public double getCircleArea(){
        return Math.PI * radius * radius;
    }

    public void displayCircleDetails(){
        System.out.println("Circle color : " + this.color);
        System.out.println("Circle radius : " + this.radius);
        System.out.println("Circle area : " + getCircleArea());
    }
}

class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(String color,double width,double height){
        super(color);
        this.height = height;
        this.width = width;
    }

    public double getRectangleArea(){
        return height * width;
    }

    public void displayRectangleDetails(){
        System.out.println("Rectangle color : " + this.color);
        System.out.println("Rectangle height : " + this.height);
        System.out.println("Rectangle width : " + this.width);
        System.out.println("Rectangle area : " + getRectangleArea());
    }
}

public class Animals {

    public static void main(String[] args) {

        Dog dog = new Dog("Brayan",10,"Normal");
        System.out.println(dog.description());
        System.out.println("*************************************");

        Cat cat = new Cat("Puru Puru",2,"White");
        System.out.println(cat.description());
        System.out.println("*************************************");

        Car car = new Car("Metal","BMW",4);
        car.displayCarInfo();
        System.out.println("*************************************");

        Truck truck = new Truck("Full Iron Metal","Big Truck",1.5);
        truck.displayTruckInfo();
        System.out.println("*************************************");

        Book book = new Book("Advance Engeneering Mathematics","HK DASS","123BOO");
        book.displayBookDetails();
        System.out.println("*************************************");

        Ebook ebook = new Ebook("Advance Calculus","Lan Samuel","1256DOS","100MB");
        ebook.displayEbookDetails();
        System.out.println("*************************************");

        PrintedBook printedBook = new PrintedBook("Trigonometry","Shane Weston","4567ASD",2000);
        printedBook.displayPrintedBookDetails();
        System.out.println("*************************************");

        Employee employee = new Employee("Ravi","EMP001");
        System.out.println(employee.getEmployeeName());
        System.out.println(employee.getEmployeeID());
        System.out.println("*************************************");

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("Ravi","EMP009",100000.00);
        fullTimeEmployee.displayFullTimeEmployeeDetails();
        System.out.println("*************************************");

        PartTimeEmployees partTimeEmployees = new PartTimeEmployees("Kamal","EMP007","HR 8");
        partTimeEmployees.displayPartTimeEmployeeDetails();
        System.out.println("*************************************");

        Shape shape = new Shape("Red");
        System.out.println(shape.getColor());
        System.out.println("*************************************");

        Circle circle =  new Circle("Blue",40);
        circle.getCircleArea();
        circle.displayCircleDetails();
        System.out.println("*************************************");

        Rectangle rectangle = new Rectangle("Orange",50.89d,38.98);
        rectangle.getRectangleArea();
        rectangle.displayRectangleDetails();
        System.out.println("*************************************");

        for (int i = 2; i < 10; i = i*i) {
            System.out.println(i);
        }
    }
}
