package command.remote;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 关闭音响命令
 */
public class StereoOffCommand implements Command {
	Stereo stereo;

	public StereoOffCommand(Stereo stereo) {
		this.stereo = stereo;
	}

	public void execute() {
		stereo.off();
	}
}
