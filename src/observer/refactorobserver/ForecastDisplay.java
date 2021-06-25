package observer.refactorobserver;

import observer.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay  implements Observer, DisplayElement {

    Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof  WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Watch out for cooler, rainy weather " +
                "Avg/Max/Min temperature = "+ currentPressure +"/"+ lastPressure);
    }
}
