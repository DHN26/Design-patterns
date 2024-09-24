package io.observer;

public class Main {
	public static void main(String[] args) {

	WeatherStation weatherStation = new WeatherStation();

    CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay();
    StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
    ForecastDisplay forecastDisplay = new ForecastDisplay();

    weatherStation.register(currentDisplay);
    weatherStation.register(statisticsDisplay);
    weatherStation.register(forecastDisplay);

    weatherStation.setMeasurements(80, 65, 30);
    weatherStation.setMeasurements(82, 70, 29);
    weatherStation.setMeasurements(78, 90, 28);

    // Removing a display unit
    weatherStation.deregister(statisticsDisplay);
    weatherStation.setMeasurements(75, 80, 27);

}
}
