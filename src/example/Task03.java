package example;

import example.enums.ActionType;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sunql
 * @date 2023年01月14日 11:45
 *
 * <p>
 *    将活动和任务管理器的接收通知功能定制成具体观察者
 * </p>
 */
public class Task03 {
    private Long taskId;

    // 初始化为初始态
    private State02 state = new TaskInit02();

    // 更新状态
    public void updateState(ActionType actionType) {
        state.update(this, actionType);
    }

    public Long getTaskId() {
        return taskId;
    }

    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    public State02 getState() {
        return state;
    }

    public void setState(State02 state) {
        this.state = state;
    }
}

/**
 * 抽象观察者
 */
interface Observer {
    void response(Long taskId); // 反应
}

/**
 * 抽象目标
 */
abstract class Subject {
    protected List<Observer> observers = new ArrayList<>();

    // 增加观察者方法
    public void add(Observer observer) {
        observers.add(observer);
    }

    // 删除观察者方法
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    // 通知观察者方法
    public void notifyObserver(Long taskId) {
        for (Observer observer : observers) {
            observer.response(taskId);
        }
    }
}

/**
 * 活动观察者
 */
class ActivityObserver implements Observer {
    private ActivityService activityService;

    @Override
    public void response(Long taskId) {
        activityService.notifyFinished(taskId);
    }
}

/**
 * 任务管理观察者
 */
class TaskManageObserver implements Observer {
    private TaskManager taskManager;

    @Override
    public void response(Long taskId) {
        taskManager.release(taskId);
    }
}

interface State02 {
    // 默认实现，不做任何处理
    default void update(Task03 task, ActionType actionType) {
        // do nothing
    }
}

// 任务进行状态
class TaskOngoing02 extends Subject implements State02 {
    @Override
    public void update(Task03 task, ActionType actionType) {
        if (actionType == ActionType.ACHIEVE) {
            task.setState(new TaskFinished02());
            // 通知
            notifyObserver(task.getTaskId());
        } else if (actionType == ActionType.STOP) {
            task.setState(new TaskPaused02());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired02());
        }
    }
}
// 任务初始状态
class TaskInit02 implements State02 {
    @Override
    public void update(Task03 task, ActionType actionType) {
        if (actionType == ActionType.START) {
            TaskOngoing02 taskOngoing = new TaskOngoing02();
            taskOngoing.add(new ActivityObserver());
            taskOngoing.add(new TaskManageObserver());
            task.setState(taskOngoing);
        }
    }
}


/**
 * 任务完成状态
 */
class TaskFinished02 implements State02 {

}

/**
 * 任务过期状态
 */
class TaskExpired02 implements State02 {

}

/**
 * 任务暂停状态
 */
class TaskPaused02 implements State02 {
    @Override
    public void update(Task03 task, ActionType actionType) {
        if (actionType == ActionType.START) {
            task.setState(new TaskOngoing02());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired02());
        }
    }
}
