package io.observer;

public class ForecastDisplay implements Observer{

	private int lastPressure;
    private int currentPressure;

    public ForecastDisplay() {
        lastPressure = 29; 
    }

    @Override
    public void update(int temperature, int humidity, int pressure) {
        lastPressure = currentPressure;
        currentPressure = pressure;
        display();
    }

    public void display() {
        System.out.print("Forecast: ");
        if (currentPressure > lastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (currentPressure == lastPressure) {
            System.out.println("Same weather predicted.");
        } else {
            System.out.println("Watch out for rainy weather");
        }
    }
}
