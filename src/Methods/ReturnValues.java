package Methods;

public class ReturnValues {
    /*
    The methods we have seen so far output their result.
    In some cases we do not need to output the result, but need to assign it to a variable, to work with it in our program.
    In these cases, we need our method to return the result value.*/

    static void perc1(double num, int percentage) {
        double res = num * percentage / 100;
        System.out.println(res);
    }
    //todo The void keyword in the definition specifies that the method does not return any value.

    //  static double perc(double num, int percentage) {
    //}
    // This means that our perc method will return a value of type double.

    static double perc2(double num, int percentage) {
        double res = num * percentage / 100;
        return res;
    }
    //The return keyword stops the method from executing. If there are any statements after return, they won't run.


    // After we have creat2222222222222222222draw() method could return the remaining balance of the account.

//todo EXAMPLE

    //Let's create a method that takes two parameters, a String name and a grade of type integer,
    // checks if the grade is over 70 and returns a boolean result.
    // Then, let's use it in main:
    static boolean check(int grade) {
        if (grade >= 70) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int x = 89;
        if (check(x) == true) {
            System.out.println("Congrats!");
        }
    }


}
