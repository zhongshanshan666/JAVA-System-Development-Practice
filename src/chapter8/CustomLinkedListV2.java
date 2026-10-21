package chapter8;

public class CustomLinkedListV2 {
    public static void main(String[] args) {
        IntNode headObj;    // 创建 IntNode 变量
        IntNode currObj;
        IntNode lastObj;
        int i;      // 循环索引

        headObj = new IntNode(-1);  // 节点列表的起始位置
        lastObj = headObj;

        for (i = 0; i < 20; ++i) {
            int rand = (int)(Math.random() * 100000);   // 随机整数(0~99999)
            currObj = new IntNode(rand);

            lastObj.insertAfter(currObj); // 追加当前节点
            lastObj = currObj;
        }

        currObj = headObj;  // 输出链表
        while (currObj != null) {
            currObj.printNodeData();
            currObj = currObj.getNext();
        }
    }
}
