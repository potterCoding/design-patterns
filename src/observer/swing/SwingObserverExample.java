package observer.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author: Java伴我余生
 * @date: 2021-06-24
 * @description: 简单的Swing应用
 */
public class SwingObserverExample {

    JFrame frame;

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("我应该努力吗？");
        // 这里有两个观察者，一个是天使，一个是恶魔
        button.addActionListener(new AngelListener());
        button.addActionListener(new DevilListener());
        frame.getContentPane().add(BorderLayout.CENTER, button);
        // 在这里设置frame属性
        frame.setSize(300,300);
        frame.setVisible(true);
    }

    // 天使观察者
    class AngelListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("为了更好的未来，你需要更加的努力奋斗！");
        }
    }

    // 恶魔观察者
    class DevilListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("努力也逃不过内卷，还是躺平吧！");
        }
    }

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

}
