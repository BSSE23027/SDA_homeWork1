
// Concrete observer that provides weather forecasts
public class ForecastDisplay implements Observer, DisplayElement {
  private Subject weatherData;
  private Float temperature;
  private Float humidity;
  private Float pressure;

  public ForecastDisplay(Subject weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }

  public void update(Float temperature, Float humidity, Float pressure){
    this.temperature = temperature;
    this.humidity = humidity;
    this.pressure = pressure;
    display();
  }

  public void display(){
    if (temperature > 80f && humidity > 50f){
      System.out.println("Forecast: Hot and Humid weather ahead\n");
    } else if (temperature <=50f && humidity <=50f){
      System.out.println("Forecast: Improving Weather on the way\n");
    } else {
      System.out.println("Forecast: Watch out for cooler, rainy weather\n");
    }
  }
}