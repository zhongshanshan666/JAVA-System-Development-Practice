package chapter13;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class SalaryGUI {
    public static void main(String[] args) {
        int hourlyWage;
        JFrame topFrame = null;         // Application window
        JTextField outputField = null;      // Displays output salary

        hourlyWage = 20;

        // Create text field 创建文本字段
        outputField = new JTextField();
        // Display program output using the text field 使用文本字段显示程序输出
        outputField.setText("An hourly wage of " + hourlyWage + "/hr" + " yields $" + (hourlyWage * 40 * 50) + "/yr.");

        // Prevent user from editing output text 阻止用户编辑输出文本
        outputField.setEditable(false);

        // Create window 创建窗口
        topFrame = new JFrame("Salary");

        // Add text field to window Add text field to window
        topFrame.add(outputField);

        // Resize window to fit components 调整窗口大小以适应组件
        topFrame.pack();

//        outputField.setText("An hourly wage ...");

        // Set program to terminate when window is closed  设置程序在窗口关闭时终止
        topFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Display window
        topFrame.setVisible(true);
    }
}
