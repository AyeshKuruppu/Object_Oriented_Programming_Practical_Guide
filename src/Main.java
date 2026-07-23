//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Person obj1 = new Person("Male",25,"Kurunegala");
        obj1.displayPerson();
        obj1.move();
        obj1.say();
        obj1.think();

        System.out.println("*************************");

        Teacher obj2 = new Teacher("Male",30,"Galle","Artifical Intelligence","B.Sc Hons IT");
        obj2.displayTeacher();
        obj2.givenInstructions("Hello Java");
        obj2.assessWork();
        obj2.teach();

        System.out.println("*************************");

        Student2 obj3 = new Student2("Male",29,"Colombo","IT","Red");
        obj3.displayStudent2();
        obj3.satOfExam("2026/01/31");
        obj3.presentWork();
        obj3.takeBreak("30 MIN");
    }
}