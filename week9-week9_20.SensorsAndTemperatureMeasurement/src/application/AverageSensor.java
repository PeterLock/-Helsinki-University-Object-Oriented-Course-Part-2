package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        sensors = new ArrayList<Sensor>();
        readings = new  ArrayList<Integer>();
    }

    public void addSensor(Sensor sensor) {
        sensors.add(sensor);
    }

    public List<Integer> readings() {
        return readings;
    }

    @Override
    public boolean isOn() {

        if (sensors.isEmpty()) {
            return false;
        }

        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                return false;
            }
        }

        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors) {
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors) {
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if (!isOn()) {
            throw new IllegalStateException();
        }

        int sum = 0;
        for (Sensor sensor : sensors) {
            sum += sensor.measure();
        }

        int measurement = sum / sensors.size();

        readings.add(measurement);

        return measurement;
    }
}