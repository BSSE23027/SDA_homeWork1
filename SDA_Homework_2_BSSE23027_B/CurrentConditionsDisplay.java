public class CurrentConditionsDisplay implements Observer, DisplayElement {
  Subject weatherData; 
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
    System.out.println("----- Current Conditions:\nTemperature: " + temperature + "F degrees\n" + "humidity: " + humidity + "%\npressure: " + pressure);
  }
}