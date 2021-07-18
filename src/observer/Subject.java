package observer;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-23
 * @description: 主题接口
 */
public interface Subject {
    void registerObserver(Observer observer); // 观察者注册
    void removeObserver(Observer observer); // 移除观察者
    void notifyObservers(); // 通知观察者
}
