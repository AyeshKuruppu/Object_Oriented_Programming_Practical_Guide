class Calculator{

    public int additionOfTwoIntegers(int a,int b){
        return a + b;
    }

    public int additionOfThreeIntegers(int a,int b,int c){
        return a + b + c;
    }

    public double additionOfTwoDoubles(double a,double b){
        return a + b;
    }
}

class Shapes{

    public double rectangleArea(double length,double width){
        return length * width;
    }

    public double circleArea(double radius){
        return Math.PI * radius * radius;
    }

    public double traingleArea(double baseLength , double perpendicularHeight){
        return 0.5 * baseLength * perpendicularHeight;
    }
}

class Time{

    public int convertHoursAndMinutesToSeconds(int hours, int minutes){
        return (hours * 3600) + (minutes * 60);
    }

    public int convertMinutesAndSecondsToSeconds(int minutes, int seconds){
        return (minutes * 60) + seconds;
    }

    public int convertHours_Minutes_SecondsToSeconds(int hours, int minutes, int seconds){
        return (hours * 3600) + (minutes * 60) + seconds;
    }
}


public class Calculation {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("<-- Calling Methods of Calculator Class--> ");
        System.out.println(calculator.additionOfTwoIntegers(78,67));
        System.out.println(calculator.additionOfThreeIntegers(78,67,70));
        System.out.println(calculator.additionOfTwoDoubles(78.89,67.654));
        System.out.println("***************************************************");

        Shapes shapes = new Shapes();
        System.out.println("<-- Calling Methods of Shapes Class -->");
        System.out.println("Area of the Rectangle is : " + shapes.rectangleArea(56.90,90.89));
        System.out.println("Area of the Circle is    : " + shapes.circleArea(67.99));
        System.out.println("Area of the Traingle is  : " + shapes.traingleArea(56.90,90.89));
        System.out.println("***************************************************");

        Time time = new Time();
        System.out.println("<-- Calling Methods of Time Class -->");
        System.out.println("Total Seconds : " + time.convertHoursAndMinutesToSeconds(10,58));
        System.out.println("Total Seconds : " + time.convertMinutesAndSecondsToSeconds(50,30));
        System.out.println("Total Seconds : " + time.convertHours_Minutes_SecondsToSeconds(9,48,55));
    }
}


