public class StaticMethodsTest {

    public static void main(String[] args) {
        double fahrenheit = TemperatureConverter.celsiusToFahrenheit(0);
        double celsius = TemperatureConverter.fahrenheitToCelsius(32);
        System.out.println("0 gradi celsius : " + fahrenheit + " gradi F");
        System.out.println("32 gradi F " + celsius + " gradi C");
    }
}
