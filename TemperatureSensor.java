package sensor;

import java.util.Random;

public class TemperatureSensor {
  private double temperature;
  
  public TemperatureSensor() {}
  
  public double senseTemperature() {
    Random r = new Random();
    int value = r.nextInt(400);
    temperature = value;
    return temperature;
  }
  
  public String getTempReport() {
    if (temperature > 300.00) {
      return "DANGER";
    }else if (temperature >= 235.00 && temperature <= 300.00) {
      return "CRITICAL";
    }else {
      return "OK";
    }
  }
  
  public String getSensorType() {
    return "Temperature Sensor";
  }
}
