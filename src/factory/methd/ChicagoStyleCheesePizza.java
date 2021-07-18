package factory.methd;

/**
 * @author: 小懒编程日记
 * @date: 2021-06-25
 * @description: 芝加哥风味奶酪比萨
 */
public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		name = "芝加哥风味深盘芝士披萨";
		dough = "特厚皮面团";
		sauce = "梅子番茄酱";

		toppings.add("马苏里拉奶酪丝");
	}

	void cut() {
		System.out.println("把比萨切成方块");
	}
}
