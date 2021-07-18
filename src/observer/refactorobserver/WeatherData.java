package observer.refactorobserver;

import java.util.Observable;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-24
 * @description: 利用Java内置的观察者模式实现
 * 我们不再需要追踪观察者了，也不需要管理注册与删除（让超类代劳即可）。
 * 所以我们把注册、添加、通知的相关代码删除。
 */
public class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        // 我们的构造器不再需要为了记住观察者们而建立数据结构了
    }

    public void measurementsChanged() {
        setChanged();
        // 在调用notifyObservers()之前，要先调用setChanged()来指示状态已经改变
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
