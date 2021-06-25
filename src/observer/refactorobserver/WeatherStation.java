package observer.refactorobserver;


public class WeatherStation {

    public static void main(String[] args) {
        // 首先，建立一个WeatherData对象
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        // 模拟新的气象测量
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
    }
}
