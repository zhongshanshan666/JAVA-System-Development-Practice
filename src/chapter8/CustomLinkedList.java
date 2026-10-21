package chapter8;

public class CustomLinkedList {
    public static void main(String[] args) {
        IntNode headObj;        // 创建 IntNode 引用变量
        IntNode nodeObj1;
        IntNode nodeObj2;
        IntNode nodeObj3;
        IntNode currObj;

        // 节点列表的起始位置
        headObj = new IntNode(-1);

        // 插入更多节点
        nodeObj1 = new IntNode(555);
        headObj.insertAfter(nodeObj1);

        nodeObj2 = new IntNode(999);
        nodeObj1.insertAfter(nodeObj2);

        nodeObj3 = new IntNode(777);
        nodeObj1.insertAfter(nodeObj3);

        // 输出链表
        currObj = headObj;
        while (currObj != null) {
            currObj.printNodeData();
            currObj = currObj.getNext();
        }
    }
}


