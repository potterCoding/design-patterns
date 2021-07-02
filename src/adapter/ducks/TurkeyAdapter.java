package adapter.ducks;

/**
 * @author: Java伴我余生
 * @date: 2021-07-02
 * @description: 火鸡适配器
 */
public class TurkeyAdapter implements Duck {
	Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		this.turkey = turkey;
	}

	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for(int i=0; i < 5; i++) {
			turkey.fly();
		}
	}
}
