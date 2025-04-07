public class ConversorTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 25.0;
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("Temperatura en Celsius: " + temperaturaCelsius + "°C");
        System.out.println("Temperatura en Fahrenheit: " + temperaturaFahrenheit + "°F");

        // Casting: Casteo Explícito
        int temperaturaEnFahrenheit = (int) temperaturaFahrenheit;
        System.out.println("La temperatura en Fahrenheit es: " + temperaturaEnFahrenheit + "°F");
    }
}

