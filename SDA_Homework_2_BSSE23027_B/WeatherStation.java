import java.util.*;

public class WeatherStation {
  public static void main(String[] args){
    WeatherData weatherData = new WeatherData();
    
    CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
    ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
    
    weatherData.setMeasurements(80.1f, 65.3f, 30.4f);
    weatherData.setMeasurements(50f, 35f, 10.4f);
    weatherData.setMeasurements(50f, 35f, 10.4f);

  }
}