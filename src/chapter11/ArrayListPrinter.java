package chapter11;

import java.util.ArrayList;

public class ArrayListPrinter {

    //此方法用于输出由 Object 对象组成的 ArrayList
    public static void printArrayList(ArrayList<Object> objList) {
        int i;

        for (i = 0; i < objList.size(); ++i) {
            System.out.println(objList.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Object> object = new ArrayList<Object>();

        // 向 objList 中添加各个类的新实例
        object.add(new Object());
        object.add(12);
        object.add(3.14);
        object.add(new String("Hello!"));

        //
        printArrayList(object);
    }
}
