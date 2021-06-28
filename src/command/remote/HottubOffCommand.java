package command.remote;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 关闭热水浴缸
 */
public class HottubOffCommand implements Command {
	Hottub hottub;

	public HottubOffCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.cool();
		hottub.off();
	}
}
