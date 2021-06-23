package observer;

public interface Observer {
    /**
     * 所有的观察者必须实现update()，以实现观察者接口
     * 当气象观察值发生变化时，主题会把这些状态值当作方法的参数，传递给观察者
     * @param temp 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(float temp, float humidity, float pressure);
}
