package command.remote;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 关闭车库门命令
 */
public class GarageDoorDownCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorDownCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
