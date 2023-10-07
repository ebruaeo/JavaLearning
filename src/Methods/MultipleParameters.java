package Methods;

public class MultipleParameters {
    //Methods can take multiple parameters. For that, we simply need to separate them using commas, for example:
   /* static void welcome(String name, int age) {
        System.out.println("Welcome, "+name);
        System.out.println("Your age: "+age);
    }
    Now, our welcome() method takes a String and an integer as its parameters.*/

    //Now, when calling the function, we need to provide all the parameters:
    static void welcome(String name, int age) {
        System.out.println("Welcome, "+name);
        System.out.println("Your age: "+age);
    }
    public static void main(String[] args) {
        welcome("James", 42);
        welcome("Amy", 25);
    }
    //todo Note that the arguments need to match the parameters and must be passed in the same order.

    // we can create a method to calculate a given percentage of a number and output it:
    static void perc(double num, int percentage) {
        double res = num*percentage/100;
        System.out.println(res);
    }

}
