package sensor;

import java.util.Random;

public class PressureSensor {
  private double pressure;
  
  public PressureSensor() {}
  
  public double readValue() {
    Random r = new Random();
    int value = r.nextInt(10);
    pressure = value;
    return pressure;
  }
  
  public String getReport() {
    if (pressure > 6.58) {
      return "DANGER";
    } else if (pressure >= 5.00 && pressure <= 6.58) {
      return "CRITICAL";
    } else {
      return "OK";
    }
  }
  
  public String getSensorName() {
    return "Pressure Sensor";
  }
}
