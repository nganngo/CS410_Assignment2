package sensor;

import javax.swing.*;
import java.awt.*;

public class SensorApplication extends JFrame {

	public SensorApplication() {
		Sensor[] sensors = {
				new PressureSensorAdapter(new sensor.PressureSensor()),
				new RadiationSensorAdapter(new sensor.RadiationSensor()),
				new TemperatureSensorAdapter(new sensor.TemperatureSensor())
		};

		setTitle("Sensor Tracker");
		setLayout(new GridLayout(3, 1));
		setPreferredSize(new Dimension(600, 600));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		for (Sensor sensor : sensors) {
			SensorPanel sensorPnl = new SensorPanel(sensor);
			add(sensorPnl);
		}
		setVisible(true);
		pack();
	}

	public static void main(String[] args) {
		new SensorApplication();
	}
}


