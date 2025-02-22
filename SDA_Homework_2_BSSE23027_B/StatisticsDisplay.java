public class StatisticsDisplay implements Observer, DisplayElement{
  // StatisticsDisplay concrete observer uses sensor values to update and display the avg/max/min temperature;
  Subject weatherData; 
  private Float avgTemperature;
  
  public StatisticsDisplay(Subject weatherData){
    this.weatherData = weatherData;
    weatherData.registerObserver(this);
  }
  public void update(Float temperature, Float humidity, Float pressure){
    this.avgTemperature = temperature;
    display();
  }
  public void display(){
    Float max = avgTemperature+1f;
    Float min = avgTemperature-1f;
    System.out.println("----- Avg/Max/Min temperature: " + avgTemperature + "/ " + max  +"/ " + min);
  }
  
}