package singleton;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 双重检查锁
 *
 * 双重检查锁不适用于jdk1.4及更早的版本
 */
public class DoubleCheckSingleton {

    // volatile 关键词确保，当uniqueInstance变量被初始化成Singleton实例时，
    // 多个线程正确处理uniqueInstance变量
    private volatile static DoubleCheckSingleton uniqueInstance;

    private DoubleCheckSingleton() {
    }

    /**
     * 对同步方法版本改进版
     *
     * 由于只有在第一次执行此方法时，才真正需要同步，一旦设置好uniqueInstance变量，
     * 就不需要同步这个方法了
     * @return
     */
    public static DoubleCheckSingleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckSingleton();
                }
            }
        }
        return uniqueInstance;
    }

}
