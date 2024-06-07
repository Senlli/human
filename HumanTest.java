public class HumanTest {
    public static void main(String[] args) {
        // Create a Human object with default constructor
        Human defaultHuman = new Human();
        System.out.println("Default Human:");
        defaultHuman.displayInfo();
        defaultHuman.displayCurrentAge();
        System.out.println("BMI: " + defaultHuman.calculateBMI());
        defaultHuman.checkHealthStatus();
        System.out.println();

        // Create a Human object with parameterized constructor
        Human john = new Human("John", 1985, 90, 80.0, 1.8);
        System.out.println("John's Initial Info:");
        john.displayInfo();
        john.displayCurrentAge();
        System.out.println("BMI: " + john.calculateBMI());
        john.checkHealthStatus();
        System.out.println();

        // Simulate John eating 4000 calories
        john.eat(4000);
        System.out.println("After eating 4000 calories:");
        john.displayInfo();
        john.displayCurrentAge();
        System.out.println("BMI: " + john.calculateBMI());
        john.checkHealthStatus();
        System.out.println();

        // Simulate John burning 4000 calories
        john.burnCalories(4000);
        System.out.println("After burning 4000 calories:");
        john.displayInfo();
        john.displayCurrentAge();
        System.out.println("BMI: " + john.calculateBMI());
        john.checkHealthStatus();
        System.out.println();

        // Simulate John smoking 10 cigarettes
        john.smoke(10);
        System.out.println("After smoking 10 cigarettes:");
        john.displayInfo();
        System.out.println();

        // Simulate John exercising for 10 hours
        john.exercise(10);
        System.out.println("After exercising for 10 hours:");
        john.displayInfo();
        john.displayCurrentAge();
        System.out.println("BMI: " + john.calculateBMI());
        john.checkHealthStatus();
    }
}
