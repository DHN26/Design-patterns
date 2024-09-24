package io.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{
	List<Observer> list=new ArrayList<>();
	int temperature;
    int humidity;
    int pressure;

	@Override
	public void register(Observer o) {
		list.add(o);
	}

	@Override
	public void deregister(Observer o) {
		list.remove(o);
	}

	@Override
    public void notifyAllObservers() {
        for (Observer observer : list) {
            observer.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurements(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        notifyAllObservers();
    }
}
