package command.remote;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 插槽中的命令
 *
 * 所有的遥控器命令都实现了这个Command接口，此接口包含了一个方法，也就是execute()
 * 命令封装了某个特定厂商类的一组动作，遥控器可以通过调用execute()，执行这些动作
 */
public interface Command {
	public void execute();
}
