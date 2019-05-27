package sensor;

import java.util.Random;

public class RadiationSensor {
  private double radiationLevel;
  
  public RadiationSensor() {}
  
  public double getRadiationValue() {
    Random r = new Random();
    int value = r.nextInt(5);
    radiationLevel = value;
    return radiationLevel;
  }
  
  public String getStatusInfo() {
    if (radiationLevel > 4.00) {
      return "DANGER";
    } else if (radiationLevel >= 3.00 && radiationLevel <= 4.00) {
      return "CRITICAL";
    } else {
      return "OK";
    }
  }
  
  public String getName() {
    return "Radiation Sensor";
  }
}
