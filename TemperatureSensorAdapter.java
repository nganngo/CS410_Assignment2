package sensor;

public class TemperatureSensorAdapter implements  Sensor{

    private TemperatureSensor tsensor;

    TemperatureSensorAdapter(TemperatureSensor newTsensor){
        this.tsensor = newTsensor;
    }

    @Override
    public double readValue() {
        return tsensor.senseTemperature();
    }

    @Override
    public String getReport() {
        return tsensor.getTempReport();
    }

    @Override
    public String getName() {
        return tsensor.getSensorType();
    }
}
