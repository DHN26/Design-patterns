package io.observer;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer{
	private List<Integer> temperatures;
    private List<Integer> humidities;
    private List<Integer> pressures;

    public StatisticsDisplay() {
        temperatures = new ArrayList<>();
        humidities = new ArrayList<>();
        pressures = new ArrayList<>();
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        temperatures.add(temperature);
        humidities.add(humidity);
        pressures.add(pressure);
        display();
    }
    
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + average(temperatures) + "/" + max(temperatures) + "/" + min(temperatures));
        System.out.println("Avg/Max/Min humidity = " + average(humidities) + "/" + max(humidities) + "/" + min(humidities));
        System.out.println("Avg/Max/Min pressure = " + average(pressures) + "/" + max(pressures) + "/" + min(pressures));
    }

    private double average(List<Integer> values) {
        return values.stream().mapToInt(val -> val).average().orElse(0.0);
    }

    private int max(List<Integer> values) {
        return values.stream().mapToInt(val -> val).max().orElse(0);
    }

    private int min(List<Integer> values) {
        return values.stream().mapToInt(val -> val).min().orElse(0);
    }
}
