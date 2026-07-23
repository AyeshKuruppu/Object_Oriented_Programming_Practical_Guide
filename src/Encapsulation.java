class Persons{

    private String name;
    private int age;

    public Persons(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        }else{
            System.out.println("The age must be positive");
        }
    }
}

class BankAccounts{

    private String accountNumber;
    private double balance;

    BankAccounts(String accountNumber,double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }

    public double getBalance(){
        return this.balance;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        if(depositAmount > 0){
            balance = balance + depositAmount;
            System.out.println("Successfully Deposit Rs : " + depositAmount);
        }else{
            System.out.println("Deposit Amount Must Be Positive");
        }
    }

    public void withdraw(double withdrawAmount){
        if(withdrawAmount > 0){
            if(withdrawAmount <= balance){
                balance = balance - withdrawAmount;
                System.out.println("Successfully Withdraw Rs : " + withdrawAmount);
            }else{
                System.out.println("Insufficient Balance");
            }
        }else{
            System.out.println("Withdraw Amount Must Be Positive");
        }
    }
}

class Students{

    private String studentID;
    private String name;
    private int marks;

    Students(String studentID,String name,int marks){
        this.studentID = studentID;
        this.name = name;
        this.marks = marks;
    }

    public String getStudentID(){
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getMarks(){
        return this.marks;
    }

    public void setStudentGrade(int marks){

        if(this.marks >= 0 && this.marks <= 100){
            if(marks >=0 && marks <= 34){
                System.out.println("Grade is F");
            } else if(marks >=35 && marks <= 54){
                System.out.println("Grade is S");
            }else if(marks >=54 && marks <= 64) {
                System.out.println("Grade is C");
            }else if(marks >=64 && marks <= 74) {
                System.out.println("Grade is B");
            }else if(marks >=75 && marks <= 100) {
                System.out.println("Grade is A");
            }
        }else{
            System.out.println("Invalid Marks");
        }
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Persons persons = new Persons("Ravi",40);
        System.out.println("Name is : " + persons.getName());
        System.out.println("Age is  : " + persons.getAge() + " " + "years old");

        persons.setName("Kamal");
        System.out.println("Name is : " + persons.getName());

        persons.setAge(0);

        System.out.println("************************************");


        BankAccounts bankAccounts = new BankAccounts("123-0008-798",4500.50);
        System.out.println("Account Number is : " + bankAccounts.getAccountNumber());
        System.out.println("Account Balance is : " + bankAccounts.getBalance());

        bankAccounts.setAccountNumber("234-009-789");
        System.out.println("Account Number is : " + bankAccounts.getAccountNumber());

        bankAccounts.setBalance(5000);
        System.out.println("Account Balance is : " + bankAccounts.getBalance());

        bankAccounts.deposit(10000);
        bankAccounts.withdraw(1000);

        System.out.println("************************************");


        Students students = new Students("STU001","Ravi",78);
        System.out.println("Student ID   : " + students.getStudentID());
        System.out.println("Student Name : " + students.getName());
        System.out.println("Student Marks : " +  students.getMarks());

        students.setStudentID("STU008");
        System.out.println("Student ID   : " + students.getStudentID());

        students.setName("Ravi");
        System.out.println("Student Name : " + students.getName());

        students.setMarks(90);
        System.out.println("Student Marks : " +  students.getMarks());

        students.setStudentGrade(98);
    }
}
