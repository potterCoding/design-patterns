package facade.hometheater;

public class HomeTheaterTestDrive {
	public static void main(String[] args) {
		// 实例化组件
		Amplifier amp = new Amplifier("Amplifier");
		Tuner tuner = new Tuner("AM/FM Tuner", amp);
		StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
		CdPlayer cd = new CdPlayer("CD Player", amp);
		Projector projector = new Projector("Projector", player);
		TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
		Screen screen = new Screen("Theater Screen");
		PopcornPopper popper = new PopcornPopper("Popcorn Popper");

		// 根据子系统所有组件来实例化外观
		HomeTheaterFacade homeTheater =
				new HomeTheaterFacade(amp, tuner, player,
						projector, screen, lights, popper);

		// 使用简化的接口，先开启电影，然后关闭电影
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
