package sensor;

public class PressureSensorAdapter implements Sensor{

    private PressureSensor psensor;

    PressureSensorAdapter(PressureSensor newPsensor){
            this.psensor = newPsensor;
        }

    @Override
        public double readValue() {
            return psensor.readValue();
        }

        @Override
        public String getReport() {
            return psensor.getReport();
        }

        @Override
        public String getName() {
            return psensor.getSensorName();
        }
}
