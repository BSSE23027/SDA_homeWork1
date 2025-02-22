import java.util.*;

// Main class demonstrating the Observer pattern
public class WeatherStation {
  public static void main(String[] args){
    WeatherData weatherData = new WeatherData();

    // Creating and registering observers
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

    // Simulating new weather measurements
    weatherData.setMeasurements(80.1f, 65.3f, 30.4f);
    weatherData.setMeasurements(50f, 35f, 10.4f);
    weatherData.setMeasurements(50f, 35.5f, 10.4f);
  }
}