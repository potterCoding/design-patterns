package composite.menu;

/**
 * @Author: 小懒编程日记
 * @Description: 女招待
 * 我们现在只需要将最顶层的菜单交给女招待即可
 * @Date: 16:49 2021-07-26
 */
public class Waitress {
    // 最顶层的菜单包含其他所有菜单，我们称之为allMenus
    MenuComponent allMenus;

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
