package singleton;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 单例成测试
 */
public class SingletonTest {
    public static void main(String[] args) throws Exception {

        // 序列化攻击测试
//        EagerlySingleton instance = EagerlySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(
//                new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(
//                new FileInputStream(file));
//        EagerlySingleton newInstance = (EagerlySingleton) ois.readObject();
//
//        System.out.println(instance);
//        System.out.println(newInstance);
//        System.out.println(instance == newInstance);

        // 反射攻击测试
//        Class<EagerlySingleton> singletonClass = EagerlySingleton.class;
//        Constructor<EagerlySingleton> constructor = singletonClass.getDeclaredConstructor();
//        constructor.setAccessible(true);
//
//        EagerlySingleton instance = EagerlySingleton.getInstance();
//        EagerlySingleton newInstance = constructor.newInstance();
//
//        System.out.println(instance == newInstance);

        EnumSingleton instance = EnumSingleton.getInstance();
        instance.setData(new Object());
        ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream("singleton_file"));
        oos.writeObject(instance);

        File file = new File("singleton_file");
        ObjectInputStream ois = new ObjectInputStream(
                new FileInputStream(file));
        EnumSingleton newInstance = (EnumSingleton) ois.readObject();

        System.out.println(instance.getData());
        System.out.println(newInstance.getData());
        System.out.println(instance.getData() == newInstance.getData());
    }
}
