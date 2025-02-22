import java.util.ArrayList;
// Subject implementation that maintains observers and notifies them
public class WeatherData implements Subject {
  private ArrayList<Observer> observers;
  private Float temperature;
  private Float humidity;
  private Float pressure;

  public WeatherData(){
    observers = new ArrayList<>();
  }

  public void registerObserver(Observer o){
    observers.add(o);
  }

  public void removeObserver(Observer o){
    observers.remove(o);
  }

  public void notifyObservers(){
    for(int i = 0; i < observers.size(); i++){
        Observer observer = (Observer)observers.get(i);
        observer.update(temperature, humidity, pressure);
    }
  }

  // Called when weather data changes
  public void measurementsChanged(){
    notifyObservers();
  }
// After measurements are set then measurementsChanged() is called and registered observers are notified
  public void setMeasurements(Float temp, Float humidity, Float pressure){
    this.temperature = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    measurementsChanged();
  }
}
