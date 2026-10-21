package chapter8;

public class IntNode {
    private int dataVal;            // 节点数据
    private IntNode nextNodeRef;        // 指向下一个节点的引用

    public IntNode() {
        dataVal = 0;
        nextNodeRef = null;
    }

    // 构造方法
    public IntNode(int dataInit) {
        this.dataVal = dataInit;
        this.nextNodeRef = null;
    }

    /* 在当前节点之后插入节点。
    * 插入前：当前节点 -- 下一个节点
    * 插入后：当前节点 -- 新节点 -- 下一个节点
    * */
    public void insertAfter(IntNode nodeLoc) {
        IntNode tmpNext;

        tmpNext = this.nextNodeRef;
        this.nextNodeRef = nodeLoc;
        nodeLoc.nextNodeRef = tmpNext;
    }

    // 获取 nextNodeRef 所指向的位置
    public IntNode getNext() {
        return this.nextNodeRef;
    }

    public void printNodeData() {
        System.out.println(this.dataVal);
    }
}

