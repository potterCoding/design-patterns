package iterator.dinermerger;

/**
 * @Author: 小懒编程日记
 * @Description: 测试
 * @Date: 16:10 2021-07-26
 */
public class MenuTestDrive {
    public static void main(String[] args) {
        // 第一步：创建两份不同的新菜单
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();
        // 第二步：创建一个女招待，并将两份菜单传递给她
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        // 第三步：让招待员打印出菜单
        waitress.printMenu();

    }
}
