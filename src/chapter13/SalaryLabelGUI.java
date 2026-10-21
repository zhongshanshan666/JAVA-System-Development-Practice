package chapter13;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class SalaryLabelGUI {

    public static void main(String[] args) {
        int hourlyWage;
        JFrame topFrame = null;                // 应用程序窗口
        JLabel wageLabel = null;               // 小时工资标签
        JLabel salLabel = null;                // 年薪标签
        JTextField salField = null;            // 显示小时工资
        JTextField wageField = null;           // 显示年薪
        GridBagConstraints layoutConst = null; // GUI 组件布局

        hourlyWage = 30;

        // 设置小时工资和年薪
        wageLabel = new JLabel("Hourly wage:");
        salLabel = new JLabel("Yearly salary:");

        wageField = new JTextField(15);
        wageField.setEditable(false);
        wageField.setText(Integer.toString(hourlyWage));

        salField = new JTextField(15);
        salField.setEditable(false);
        salField.setText(Integer.toString((hourlyWage * 40 * 50)));

        // 使用 GridBagLayout 创建窗体和添加组件
        topFrame = new JFrame("Salary");

        // 使用 GridBagLayout
        topFrame.setLayout(new GridBagLayout());

        // 创建 GridBagConstraints
        layoutConst = new GridBagConstraints();

        // 指定组件在网格中的位置
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;

        // 在组件周围留出 10 像素的内边距
        layoutConst.insets = new Insets(10, 10, 10, 10);

        // 使用指定的约束条件添加组件
        topFrame.add(wageLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        topFrame.add(wageField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        topFrame.add(salLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        topFrame.add(salLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        layoutConst.insets = new Insets(10, 10, 10, 10);
        topFrame.add(salField, layoutConst);

        // 窗口关闭时终止程序
        topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 调整窗口大小以适应其中的组件
        topFrame.pack();

        // Display window
        topFrame.setVisible(true);

    }
}
