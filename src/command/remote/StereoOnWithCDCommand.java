package command.remote;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 打开音响命令
 */
public class StereoOnWithCDCommand implements Command {
	Stereo stereo;

	/**
	 * 传入音响实例
	 * @param stereo 音响实例
	 */
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.on();  // 打开音响
		stereo.setCD(); // 设置成播放CD
		stereo.setVolume(11); // 播放音量设置为 11
	}
}
