package Methods;

public class CalculateArea {
    // !Exercise 1: Calculate Area
    // ! Write a Java method called "calculateArea" that calculates and returns the area of a rectangle given its length and width as parameters.
    // ! Then, write a main method to test the "calculateArea" method with different values.

    static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        System.out.println(calculateArea(2.5, 6));
    }


}
