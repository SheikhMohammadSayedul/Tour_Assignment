public class WeatherForecastRunner {
    public static void main(String[] args) {
        WeatherForecast[] forecasts = new WeatherForecast[5];

        forecasts[0] = new WeatherForecast("Monday", 25.0, "Sunny");
        forecasts[1] = new WeatherForecast("Tuesday", 22.5, "Partly Cloudy");
        forecasts[2] = new WeatherForecast("Wednesday", 20.0, "Rainy");
        forecasts[3] = new WeatherForecast("Thursday", 18.0, "Windy");
        forecasts[4] = new WeatherForecast("Friday", 21.0, "Sunny");

        for (WeatherForecast forecast : forecasts) {
            System.out.println(forecast);
        }
    }
}
