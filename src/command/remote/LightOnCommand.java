package command.remote;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 开灯命令
 */
public class LightOnCommand implements Command {
	Light light;

	public LightOnCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.on();
	}
}
