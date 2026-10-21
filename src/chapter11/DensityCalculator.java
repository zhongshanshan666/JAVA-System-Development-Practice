package chapter11;

import java.util.Scanner;

public class DensityCalculator {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double massVal = 0;       // 物体质量（千克）
        double volumeVal = 0;     // 物体体积（立方米）
        double densityCalc;       // 计算得到的密度

        try {
            massVal = scnr.nextDouble();

            // 错误检查：质量不能为负数
            if (massVal < 0.0) {
                throw new Exception("无效的质量");
            }

            volumeVal = scnr.nextDouble();

            // 错误检查：体积不能为负数
            if (volumeVal < 0.0) {
                throw new Exception("无效的体积");
            }

            densityCalc = massVal / volumeVal;

            System.out.print("密度：" + densityCalc);
        }
        catch (Exception excpt) {
            // 输出由 throw 语句传递的错误消息
            System.out.print(excpt.getMessage());
        }
    }
}