package Methods;

public class MethodParameters {

    /*
Methods can have parameters, which they can use in their code.
The parameters are defined in the parentheses, and can be used like variables in the method.
For example, let's add a name String parameter to our welcome() function:
     */
  /*  static void welcome(String name) {
        System.out.println("Welcome, " + name);
    }*/
    //The method above takes a String called name as its parameter, which is used in the method.

    //TODO when calling the method, we need to pass it a value for the name parameter inside the parentheses:
    static void welcome(String name) {
        System.out.println("Welcome, "+name);
    }
    public static void main(String[] args) {
        welcome("James");
        welcome("Amy");
    }
    //This way, we can call our method with different parameters and generate different results based on them.
}
