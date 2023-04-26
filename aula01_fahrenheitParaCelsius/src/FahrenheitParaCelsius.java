public class FahrenheitParaCelsius {

    public static void main(String[] args) {
        int saturdayFahrenheit;
        int sundayFahrenheit;

        saturdayFahrenheit = 87;
        sundayFahrenheit = 91;

        double saturdayCelsius = (5.0/9) * (saturdayFahrenheit -32);
        double sundayCelsius = (5.0/9) * (sundayFahrenheit - 32);

        System.out.println("Saturday: " + saturdayCelsius);
        System.out.println("Sunday: " + sundayCelsius);
    }
    
}
