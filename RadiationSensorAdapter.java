package sensor;

public class RadiationSensorAdapter implements Sensor{

    private RadiationSensor rsensor;

    RadiationSensorAdapter(RadiationSensor newRsensor){
        this.rsensor = newRsensor;
    }

    @Override
    public double readValue() {
        return rsensor.getRadiationValue();
    }

    @Override
    public String getReport() {
        return rsensor.getStatusInfo();
    }

    @Override
    public String getName() {
            return rsensor.getName();
        }

}
