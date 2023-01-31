package example.enums;

/**
 *  任务状态枚举
 */
public enum TaskState {
    INIT("初始化"),
    ONGOING( "进行中"),
    PAUSED("暂停中"),
    FINISHED("已完成"),
    EXPIRED("已过期")
    ;
    private final String message;

    TaskState(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
