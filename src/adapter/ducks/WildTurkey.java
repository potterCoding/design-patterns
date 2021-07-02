package adapter.ducks;

/**
 * @author: Java伴我余生
 * @date: 2021-07-02
 * @description: 火鸡实现类
 */
public class WildTurkey implements Turkey {
	public void gobble() {
		System.out.println("Gobble gobble");
	}

	public void fly() {
		System.out.println("I'm flying a short distance");
	}
}
