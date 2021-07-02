package command.undo;

/**
 * @author: Java伴我余生
 * @date: 2021-07-02
 * @description: 吊扇
 */
public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;	// 吊扇的速度

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public void high() {
		speed = HIGH;	// 设置高转速
		System.out.println(location + " ceiling fan is on high");
	}

	public void medium() {
		speed = MEDIUM; // 设置中转速
		System.out.println(location + " ceiling fan is on medium");
	}

	public void low() {
		speed = LOW; // 设置低转速
		System.out.println(location + " ceiling fan is on low");
	}

	public void off() {
		speed = OFF; // 关闭吊扇
		System.out.println(location + " ceiling fan is off");
	}

	public int getSpeed() {
		// 获取当前吊扇的速度
		return speed;
	}
}
