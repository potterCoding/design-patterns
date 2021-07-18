package templatemethod;

/**
 * @author: 小懒编程日记
 * @date: 2021-07-18
 * @description: 模板方法定义
 * 将泡茶和怕咖啡的步骤抽象成一个模板方法
 * 泡茶步骤：1.把水煮沸 2.用热水泡茶 3.把茶倒进杯子 4.加柠檬
 * 泡咖啡步骤：1.把水煮沸 2.用热水冲泡咖啡 3.把咖啡倒进杯子 4.加糖和牛奶
 *
 * 抽象成模板方法：
 * 	1.把水煮沸 2.用热水泡咖啡或茶 3.把饮料倒进杯子 4.加调料
 */
public abstract class CaffeineBeverage {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}
}
