package command.undo;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 添加撤销按钮
 */
public interface Command {
    public void execute();
    public void undo();
}
