package example;

import example.enums.ActionType;
import example.enums.TaskState;

/**
 * @author sunql
 * @date 2023年01月14日 11:32
 *
 * 任务状态变更功能
 * 1.接收不同的行为，然后更新当前任务的状态；
 * 2.当任务过期时，通知任务所属的活动和任务管理器。
 */
public class Task01 {
    private Long taskId;
    // 任务的默认状态为初始化
    private TaskState state = TaskState.INIT;
    // 活动服务
    private ActivityService activityService;
    // 任务管理器
    private TaskManager taskManager;

    /**
     * 使用条件分支进行任务更新
     */
    public void updateState(ActionType actionType) {
        if (state == TaskState.INIT) {
            if (actionType == ActionType.START) {
                state = TaskState.ONGOING;
            }
        } else if (state == TaskState.ONGOING) {
            if (actionType == ActionType.ACHIEVE) {
                state = TaskState.FINISHED;
                // 任务完成后进对外部服务进行通知
                activityService.notifyFinished(taskId);
                taskManager.release(taskId);
            } else if (actionType == ActionType.STOP) {
                state = TaskState.PAUSED;
            } else if (actionType == ActionType.EXPIRE) {
                state = TaskState.EXPIRED;
            }
        } else if (state == TaskState.PAUSED) {
            if (actionType == ActionType.START) {
                state = TaskState.ONGOING;
            } else if (actionType == ActionType.EXPIRE) {
                state = TaskState.EXPIRED;
            }
        }
    }
}

/**
 * 活动服务
 */
class ActivityService {
    void notifyFinished(Long taskId) {}
}

/**
 * 任务管理器
 */
class TaskManager {
    void release(Long taskId) {}
}