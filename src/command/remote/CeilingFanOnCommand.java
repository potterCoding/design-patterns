package command.remote;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 启动起居室吊扇，高速转动
 */
public class CeilingFanOnCommand implements Command {
	CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	public void execute() {
		ceilingFan.high();
	}
}
