package command.remote;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 打开热水浴缸
 */
public class HottubOnCommand implements Command {
	Hottub hottub;

	public HottubOnCommand(Hottub hottub) {
		this.hottub = hottub;
	}

	public void execute() {
		hottub.on();
		hottub.heat();
		hottub.bubblesOn();
	}
}
