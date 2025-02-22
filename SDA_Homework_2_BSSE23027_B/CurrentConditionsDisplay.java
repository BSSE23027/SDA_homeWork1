
// Concrete observer that displays current conditions
public class CurrentConditionsDisplay implements Observer, DisplayElement {
  private Subject weatherData;
  private Float temperature;
  private Float humidity;
  private Float pressure;

  public CurrentConditionsDisplay(Subject weatherData){
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
    System.out.println("Current Conditions: " + temperature + "F degrees, " + humidity + "% humidity, Pressure: " + pressure);
  }
}