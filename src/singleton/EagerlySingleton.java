package singleton;

import com.sun.org.apache.regexp.internal.RE;

import java.io.Serializable;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 饿汉模式
 *
 * 这里实现了Serializable可序列化接口，用来测试序列化攻击
 */
public class EagerlySingleton implements Serializable {
    // 在静态初始化中创建单例，保证了线程安全
    private static EagerlySingleton uniqueInstance = new EagerlySingleton();

    private EagerlySingleton() {
        if (uniqueInstance != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static EagerlySingleton getInstance() {
        // 已经有实例了，直接使用它
        return uniqueInstance;
    }

    // 防止序列化攻击
    private Object readResolve() {
        return uniqueInstance;
    }
}
