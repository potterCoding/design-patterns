package command.remote;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 关灯命令
 *
 * 利用Command接口，每个动作都被实现成一个简单的命令对象
 * 命令对象持有一个厂商类实例的引用，并实现了一个execute()方法
 * 这个方法会调用厂商类实例的一个或多个方法，完成特定的行为
 * 在这个例子中，有两个类，分别打开电灯和关闭电灯
 */
public class LightOffCommand implements Command {
	Light light;

	public LightOffCommand(Light light) {
		this.light = light;
	}

	public void execute() {
		light.off();
	}
}
