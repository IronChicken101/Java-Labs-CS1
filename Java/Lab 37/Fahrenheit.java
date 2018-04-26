

public class Fahrenheit
{
    public static void main(String[] args)
    {
        toCelsius(98.6);
        toCelsius(52.30);
        toCelsius(82.45);
        toCelsius(75.00);
        toCelsius(100.00);
    }
    
    public static void toCelsius(double fahren)
    {
        double celsius = fahren - 32;
        celsius = celsius * (5/9.0);
       System.out.printf("%.2f degrees Fahrenheit = %.2f degrees Celsius \n\n\n",fahren,celsius);
    }
}
