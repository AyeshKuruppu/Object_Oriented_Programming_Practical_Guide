public class Person {

    String gender;
    int age;
    String address;


    Person(String gender,int age,String address){
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public void displayPerson(){
        System.out.println("Gender : " + this.gender);
        System.out.println("Age : " + this.age);
        System.out.println("Address : " + this.address);
    }

    public void move(){
        System.out.println("Person is Moving");
    }

    public void say(){
        System.out.println("Person is Saying");
    }

    public void think(){
        System.out.println("Person is Thinking");
    }
}


class Teacher extends Person{

    String speciality;
    String qualification;

    Teacher(String gender,int age,String address,String speciality,String qualification){
        super(gender,age,address);
        this.speciality = speciality;
        this.qualification = qualification;
    }

    public void displayTeacher(){
        System.out.println("Gender : " + this.gender);
        System.out.println("Age : " + this.age);
        System.out.println("Address : " + this.address);
        System.out.println("Speciality : " + this.speciality);
        System.out.println("Qualification : " + this.qualification);
    }

    public void givenInstructions(String givenInstructions){
        System.out.println("Given Instructions ----> " + givenInstructions);
    }

    public void assessWork(){
        System.out.println("Assess Work");
    }

    public void teach(){
        System.out.println("Teacher is Teaching");
    }
}


class Student2 extends Person{

    String course;
    String color;

    Student2(String gender,int age,String address,String course,String color){
        super(gender,age,address);
        this.course = course;
        this.color = color;
    }

    public void displayStudent2(){
        System.out.println("Gender : " + this.gender);
        System.out.println("Age : " + this.age);
        System.out.println("Address : " + this.address);
        System.out.println("Course " + this.course);
        System.out.println("Color " + this.color);
    }

    public void satOfExam(String date){
        System.out.println("Exam Date is " + date);
    }

    public void presentWork(){
        System.out.println("Work Presenting");
    }

    public void takeBreak(String time){
        System.out.println("Brake Time " + time);
    }

}

