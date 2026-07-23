class Student1{

    int id = 0;
    String name = null;
    int marks = 0;

    public void getNoHoursStudy(int noOfHours){
        System.out.println("No Of Hours " + noOfHours);
    }

    public void getTotalMarks(int totalMarks){
        System.out.println("Total Marks " + totalMarks);
    }

    public void getGrade(String grade){
        System.out.println("Grade is " + grade);
    }

    public void display(int id,String name,int marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public void displayDetails(){
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.marks);
    }
}


public class Student {

    String name = null;
    int age = 0;
    double height = 0;

    public void display( String name,int age,double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void displayDetails(){
        System.out.println("Name is " + this.name);
        System.out.println("Age is " + this.age);
        System.out.println("Height is " + this.height);
    }

    public static void main(String[] args) {
        Student myObject = new Student();
        myObject.display("Ayesh",23,60.89);
        myObject.displayDetails();

        Student1 myObject1 = new Student1();
        myObject1.display(15890,"Ravi",78);
        myObject1.displayDetails();

        myObject1.getNoHoursStudy(60);
        myObject1.getGrade("A");
        myObject1.getTotalMarks(600);
    }
}
