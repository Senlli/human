public class Human {
    String name;
    int birthYear;
    int maxAge;
    double weight; // weight in kilograms
    double height; // height in meters

    public Human() {
        name = "no name";
        birthYear = 2000;
        maxAge = 100;
        weight = 70.0; // default weight
        height = 1.75; // default height
    }

    public Human(String n, int b, int a, double w, double h) {
        name = n;
        birthYear = b;
        maxAge = a;
        weight = w;
        height = h;
    }

    public void smoke(int numOfCigarettes) {
        maxAge -= 2 * numOfCigarettes;
    }

    public void exercise(int numOfHours) {
        maxAge += numOfHours / 300;
        burnCalories(numOfHours * 300); // Assuming 1 hour of exercise burns 300 calories
    }

    public void eat(int calories) {
        weight += (calories / 4000.0) * 0.5;
    }

    public void burnCalories(int calories) {
        weight -= (calories / 4000.0) * 0.2;
    }

    public int getCurrentAge() {
        return java.time.Year.now().getValue() - birthYear;
    }

    public void displayCurrentAge() {
        System.out.println("Current age: " + getCurrentAge());
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public void checkHealthStatus() {
        double bmi = calculateBMI();
        if (bmi < 25) {
            System.out.println("Healthy");
        } else {
            System.out.println("Unhealthy");
        }
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Year of birth: " + birthYear);
        System.out.println("Maximum age: " + maxAge);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Height: " + height + " m");
    }

    public static void main(String[] args) {
        Human h = new Human("John", 1985, 90, 80.0, 1.8);
        h.displayInfo();
        h.eat(4000);
        h.displayInfo();
        h.burnCalories(4000);
        h.displayInfo();
        h.displayCurrentAge();
        System.out.println("BMI: " + h.calculateBMI());
        h.checkHealthStatus();
    }
}
