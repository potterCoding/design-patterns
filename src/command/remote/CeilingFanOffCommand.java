package command.remote;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 关闭起居室吊扇
 */
public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.off();
	}
}
