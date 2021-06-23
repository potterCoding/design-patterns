package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Java伴我余生
 * @date: 2021-06-23
 * @description: WeatherData实现了subject接口
 */
public class WeatherData implements Subject {

    private List<Observer> observers; // 使用List<Observes>来记录观察者
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer obs) {
        observers.add(obs); //注册观察者时，只要把它加到ArrayList集合中即可
    }

    @Override
    public void removeObserver(Observer obs) {
        int index = observers.indexOf(obs);
        if (index > 0) {
            observers.remove(index); //当观察者想要取消注册，把它从List中删除即可
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            // 需要把状态告诉给每一个观察者，因为观察者们都实现update()，所以我们知道如何通知他们
            observer.update(temperature, humidity, pressure);
        }
    }

    // 当从气象站得更新观测值时，我们需要通知观察者
    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
