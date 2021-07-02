package command.undo;

/**
 * @author: Java伴我余生
 * @date: 2021-07-02
 * @description: 吊扇的命令类
 */
public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed;	// 增加局部变量以便追踪吊扇之前的速度

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	/**
	 * 在execute()方法中，在我们改变吊扇的速度之前，需要先将它之前的状态记录起来，以便需要撤销时使用
	 */
	public void execute() {
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	/**
	 * 将吊扇的速度设置回之前的值，达到撤销的目的
	 */
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
