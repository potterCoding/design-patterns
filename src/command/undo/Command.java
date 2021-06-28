package command.undo;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 添加撤销按钮
 */
public interface Command {
    public void execute();
    public void undo();
}
