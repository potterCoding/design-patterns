package example;

import example.enums.ActionType;

/**
 * @author sunql
 * @date 2023年01月14日 11:36
 *
 * 使用 状态模式 优化任务状态变更功能
 */
public class Task02 {
    private Long taskId;

    // 初始化为初始态
    private State state = new TaskInit();

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

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}

interface State {
    // 默认实现，不做任何处理
    default void update(Task02 task, ActionType actionType) {
        // do nothing
    }
}

/**
 * 任务初始状态
 */
class TaskInit implements State {
    @Override
    public void update(Task02 task, ActionType actionType) {
        if (actionType == ActionType.START) {
            task.setState(new TaskOngoing());
        }
    }
}

/**
 * 任务进行状态
 */
class TaskOngoing implements State {
    private ActivityService activityService;
    private TaskManager taskManager;

    @Override
    public void update(Task02 task, ActionType actionType) {
        Long taskId = task.getTaskId();
        if (actionType == ActionType.ACHIEVE) {
            task.setState(new TaskFinished());
            // 通知
            activityService.notifyFinished(taskId);
            taskManager.release(taskId);
        } else if (actionType == ActionType.STOP) {
            task.setState(new TaskPaused());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}

/**
 * 任务完成状态
 */
class TaskFinished implements State {

}

/**
 * 任务暂停状态
 */
class TaskPaused implements State {
    @Override
    public void update(Task02 task, ActionType actionType) {
        if (actionType == ActionType.START) {
            task.setState(new TaskOngoing());
        } else if (actionType == ActionType.EXPIRE) {
            task.setState(new TaskExpired());
        }
    }
}

/**
 * 任务过期状态
 */
class TaskExpired implements State {

}