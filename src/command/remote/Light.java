package command.remote;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-28
 * @description: 灯类，具有开和关的行为
 *
 * 这些厂商类被用来控制特定的家电自动化装置
 * 在这里,我们用Light类当作例子
 */
public class Light {
	String location = "";

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println(location + " light is on");
	}

	public void off() {
		System.out.println(location + " light is off");
	}
}
