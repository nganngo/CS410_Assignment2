package sensor;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class SensorPanel extends JPanel{
    private Color rectColor;
    JLabel label;
    SensorPanel(Sensor sensor) {
        // Called once
        setPreferredSize( new Dimension(400, 300) );
        setBorder(new TitledBorder(sensor.getName()));
        double sensorNum = sensor.readValue();
        String reportValue = sensor.getReport();

        switch(reportValue) {
            case "OK":
                rectColor = Color.GREEN;
                label = new JLabel(reportValue + "--->" + sensorNum);
                break;
            case "DANGER":
                label = new JLabel(reportValue + "--->" + sensorNum);
                rectColor = Color.RED;
                break;
            case "CRITICAL":
                label = new JLabel(reportValue + "--->" + sensorNum);
                rectColor = Color.YELLOW;
                break;
        }
        add(label);
    }

    public void paintComponent(Graphics g) {
        // Called over and over
        g.setColor(rectColor);
        g.fillRect(10,30,100,50);
    }
}
