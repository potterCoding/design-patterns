package facade.hometheater;

/**
 * @author: Java伴我余生
 * @date: 2021-07-02
 * @description: 构造家庭影院外观
 */
public class HomeTheaterFacade {

	/**
	 * 这就是组合，我们会用到的所有子系统组件全部在这里
	 */
	Amplifier amp;
	Tuner tuner;
	StreamingPlayer player;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;

	/**
	 * 外观将子系统中每一个组件的引用都传入到它的构造器中
	 * 然后外观将它们赋值给相应的实例变量
	 */
	public HomeTheaterFacade(Amplifier amp,
				 Tuner tuner,
				 StreamingPlayer player,
				 Projector projector,
				 Screen screen,
				 TheaterLights lights,
				 PopcornPopper popper) {

		this.amp = amp;
		this.tuner = tuner;
		this.player = player;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}

	/**
	 * 该方法将我们之前手动进行的每项任务依次处理
	 * 请注意，每项任务都是委托给子系统中的相应组件处理
	 * @param movie
	 */
	public void watchMovie(String movie) {
		System.out.println("Get ready to watch a movie...");
		// 打开爆米花机
		popper.on();
		// 开始爆米花
		popper.pop();
		// 灯光暗度调到10%
		lights.dim(10);
		// 把屏幕放下
		screen.down();
		// 打开摄影机
		projector.on();
		// 设置为宽屏模式
		projector.wideScreenMode();
		// 打开功放
		amp.on();
		// 设置播放器
		amp.setStreamingPlayer(player);
		// 调整为环绕立体声模式
		amp.setSurroundSound();
		// 音量调到5
		amp.setVolume(5);
		// 打开播放器
		player.on();
		// 播放电影
		player.play(movie);
	}

	/**
	 * 该方法负责关闭一切
	 * 每项任务也是委托子系统中合适的组件处理
	 */
	public void endMovie() {
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		player.stop();
		player.off();
	}

	public void listenToRadio(double frequency) {
		System.out.println("Tuning in the airwaves...");
		tuner.on();
		tuner.setFrequency(frequency);
		amp.on();
		amp.setVolume(5);
		amp.setTuner(tuner);
	}

	public void endRadio() {
		System.out.println("Shutting down the tuner...");
		tuner.off();
		amp.off();
	}
}
