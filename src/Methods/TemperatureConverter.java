package Methods;

public class TemperatureConverter {
/* ! Temperature Converter
 !Create two methods, "celsiusToFahrenheit" and "fahrenheitToCelsius," that convert temperatures between Celsius and Fahrenheit.
 ! Write a main method to test both methods with various temperature values. */

    static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(30.8));
    }


}
