package command.remote;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 打开车库门命令
 */
public class GarageDoorUpCommand implements Command {
	GarageDoor garageDoor;

	public GarageDoorUpCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	public void execute() {
		garageDoor.up();
	}
}
