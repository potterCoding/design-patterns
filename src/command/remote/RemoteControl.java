package command.remote;

/**
 * @author: Java伴我余生
 * @date: 2021-06-28
 * @description: 实现遥控器
 *
 * 1.每个插槽有一个命令
 * 2.当按下按钮，就调用相应命令的execute()
 * 3.在execute()方法中，接受者的动作会被调用
 *
 *
 * RemoteControl管理一组命令对象，每个按钮都有一个命令对象
 * 每当按下按钮，就调用相应的 xxxButtonWasPushed()方法，
 * 间接造成该命令的execute()方法被调用
 */
public class RemoteControl {
    /**
     * 这个时候，遥控器要处理7个开与关的命令，
     * 使用相应数组记录这些命令
     */
    Command[] onCommands;
    Command[] offCommands;

    /**
     * 在构造器中，只需实例化并初始化这两个开与关的数组
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    /**
     * setCommand()必须有三个参数
     * 这些命令将记录在开关数组中对应的插槽位置，以供稍后使用
     *
     * @param slot 插槽的位置
     * @param onCommand 开的命令
     * @param offCommand 关的命令
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    /**
     * 当按下开或关的按钮，硬件就会负责调用对应的方法，
     * 也就是onButtonWasPushed() 或 offButtonWasPushed()
     * @param slot 插槽的位置
     */

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    /**
     * 覆盖toString()，打印出每个插槽和它对应的命令。测试时使用
     * @return
     */
    @Override
    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("\n------ Remote Control -------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "    " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuff.toString();
    }

}
