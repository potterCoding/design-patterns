package command.undo;

//
// This is the invoker
//
public class RemoteControlWithUndo {
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand; //前一个命令记录在这里

	public RemoteControlWithUndo() {
		onCommands = new Command[7];
		offCommands = new Command[7];

		Command noCommand = new NoCommand();
		for(int i=0;i<7;i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand; // 一开始，并没有所谓的前一个命令
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		// 当按下按钮，我们取得这个命令，并优先执行它
		onCommands[slot].execute();
		// 然后记录在undoCommand实例变量中
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}

	/**
	 * 当按下撤销按钮，我们调用undoCommand的undo()方法，就可以倒转前一个命令
	 */
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
				+ "    " + offCommands[i].getClass().getName() + "\n");
		}
		stringBuff.append("[undo] " + undoCommand.getClass().getName() + "\n");
		return stringBuff.toString();
	}
}
