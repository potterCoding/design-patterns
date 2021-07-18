package templatemethod;

/**
 * @author: 小懒编程日记
 * @date: 2021-07-18
 * @description: 带有钩子函数的模板方法定义
 */
public abstract class CaffeineBeverageWithHook {

	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	/**
	 * 钩子函数
	 */
	boolean customerWantsCondiments() {
		return true;
	}
}
