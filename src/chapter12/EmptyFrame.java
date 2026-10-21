package chapter12;

import javax.swing.JFrame;

public class EmptyFrame {
    public static void main(String[] args) {

        // 构造 JFrame 对象
        JFrame appFrame = new JFrame();

        // 设置框架的宽度和高度, 单位为像素
        appFrame.setSize(400, 250);

        // 设置框架的标题
        appFrame.setTitle("An Empty Frame");

        // 设置当用户关闭框架时程序退出
        appFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 使框架对用户可见
        appFrame.setVisible(true);
    }
}
