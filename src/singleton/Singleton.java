package singleton;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 最经典最简单的单例模式实现 - 懒汉模式
 *
 * 常常用来管理共享的资源：例如数据库连接池或者线程池
 */
public class Singleton {

    // 利用一个静态变量来记录Singleton类得唯一实例
    private static Singleton uniqueInstance;

    // 构造器私有化，只有在Singleton内部可以调用
    private Singleton() {}

    // 利用singleton()方法实例化对象，并返回这个实例
    public static Singleton getInstance() {
        // 该方式在多线程环境下，可能会造成产生不同的对象
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
