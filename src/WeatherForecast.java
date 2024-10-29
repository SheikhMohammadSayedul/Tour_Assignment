public class WeatherForecast {
    private String day;
    private double temperature;
    private String conditions;

    public WeatherForecast(String day, double temperature, String conditions) {
        this.day = day;
        this.temperature = temperature;
        this.conditions = conditions;
    }

    public String getDay() {
        return day;
    }

    public double getTemperature() {
        return temperature;
    }

    public String getConditions() {
        return conditions;
    }

    @Override
    public String toString() {
        return "Day: " + day + ", Temperature: " + temperature + "°C, Conditions: " + conditions;
    }
}
