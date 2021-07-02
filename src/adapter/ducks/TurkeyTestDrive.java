package adapter.ducks;

public class TurkeyTestDrive {
	public static void main(String[] args) {
		// 绿头鸭
		MallardDuck duck = new MallardDuck();
		// 通过火鸡适配器，将鸭子转为火鸡
		Turkey duckAdapter = new DuckAdapter(duck);

		for(int i=0;i<10;i++) {
			System.out.println("The DuckAdapter says...");
			duckAdapter.gobble();
			duckAdapter.fly();
		}
	}
}
