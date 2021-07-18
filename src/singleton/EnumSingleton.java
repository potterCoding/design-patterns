package singleton;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 使用枚举实现单例
 */
public enum  EnumSingleton {
    INSTANCE;

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance() {
        return EnumSingleton.INSTANCE;
    }
}
