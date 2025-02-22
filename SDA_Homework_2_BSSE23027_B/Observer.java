// Observer Interface for updating the concrete observers
public interface Observer {
  public void update(Float temp, Float humidity, Float pressure);
}